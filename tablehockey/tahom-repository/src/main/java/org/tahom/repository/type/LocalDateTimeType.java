package org.tahom.repository.type;

import java.sql.Types;
import java.time.ZoneId;
import java.util.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlInternalType;

/**
 * The META type LOCALDATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class LocalDateTimeType extends SqlInternalType {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Class<?>[] getClassTypes() {
		return new Class[] { java.util.Date.class };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getMetaTypes() {
		return new String[] { "LOCALDATETIME" };
	}

	/**
	 * {@inheritDoc}
	 */
	public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
		query.addScalar(dbName, Types.OTHER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
			boolean ingoreError) throws SqlRuntimeException {
		if (logger.isTraceEnabled()) {
			logger.trace(">>> setResult " + getMetaTypes()[0] + ": resultInstance=" + resultInstance
					+ ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
					+ ((resultValue != null) ? resultValue.getClass() : null));
		}
		if (resultValue instanceof java.sql.Timestamp) {
			if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName,
					((java.sql.Timestamp) resultValue).toLocalDateTime(), java.time.LocalDateTime.class))
				return;
		} else if (ingoreError) {
			logger.error("Incorrect localdatetime " + resultValue + " for " + attributeName + " in " + resultInstance);
			return;
		} else {
			throw new SqlRuntimeException(
					"Incorrect localdatetime " + resultValue + " for " + attributeName + " in " + resultInstance);
		}
		if (ingoreError) {
			logger.error("There's no setter for " + attributeName + " in " + resultInstance + ", META type is "
					+ getMetaTypes()[0]);
		} else {
			throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
					+ ", META type is " + getMetaTypes()[0]);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
			Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
		if (logger.isTraceEnabled()) {
			logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
					+ inputValue + ", inputType=" + inputType);
		}
		if (inputValue == null) {
			query.setParameter(paramName, inputValue, Types.TIMESTAMP);
		} else if (inputValue instanceof java.time.LocalDateTime) {
			Date value = Date.from(((java.time.LocalDateTime) inputValue).atZone(ZoneId.systemDefault()).toInstant());
			query.setParameter(paramName, value, Types.TIMESTAMP);
		}
	}
}
