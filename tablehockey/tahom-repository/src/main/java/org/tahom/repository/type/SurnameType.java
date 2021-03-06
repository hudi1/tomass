package org.tahom.repository.type;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlTaggedMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.tahom.repository.type.model.Surname;

public class SurnameType implements SqlTaggedMetaType {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Surname.class };
    }

    @Override
    public Object getProviderSqlType() {
        return this;
    }

    @Override
    public String[] getMetaTypes() {
        return new String[] { "surname" };
    }

    @Override
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes) {
        query.addScalar(dbName, Types.VARCHAR);
    }

    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName,
            Object resultValue, boolean ingoreError) throws SqlRuntimeException {
        if (resultValue == null) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, null, Surname.class))
                return;
            if (ingoreError) {
                logger.error("There's no setter for " + attributeName + " in " + resultInstance
                        + ", META type is SurnameType");
                return;
            } else {
                throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
                        + ", META type is SurnameType");
            }
        }

        if (!(resultValue instanceof String)) {
            if (ingoreError) {
                logger.error("Incorrect result value type " + resultValue + ", it should be a string");
                return;
            } else {
                throw new SqlRuntimeException("Incorrect result value type " + resultValue + ", it should be a string");
            }
        }

        String surname = (String) resultValue;

        if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, new Surname(surname), Surname.class))
            return;
        if (ingoreError) {
            logger.error("There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is SurnameType");
            return;
        } else {
            throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is SurnameType");
        }
    }

    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        if (inputValue == null) {
            query.setParameter(paramName, inputValue, Types.VARCHAR);
        } else {
            if (inputValue instanceof Collection) {
                List<String> surnames = new ArrayList<String>();
                for (Iterator iter = ((Collection) inputValue).iterator(); iter.hasNext();) {
                    Object o = iter.next();
                    if (o != null) {
                        if (!(o instanceof Surname)) {
                            if (ingoreError) {
                                logger.error("Incorrect input value type " + o + ", it should be a Surname");
                                continue;
                            } else {
                                throw new SqlRuntimeException("Incorrect input value type " + o
                                        + ", it should be a sSurname");
                            }
                        }
                    }
                }
                query.setParameterList(paramName, surnames.toArray(), Types.VARCHAR);
            } else {
                if (!(inputValue instanceof Surname)) {
                    if (ingoreError) {
                        logger.error("Incorrect input value type " + inputValue + ", it should be a sSurname");
                        return;
                    } else {
                        throw new SqlRuntimeException("Incorrect input value type " + inputValue
                                + ", it should be a sSurname");
                    }
                }
                String surname = ((Surname) inputValue).toString();
                query.setParameter(paramName, surname, Types.VARCHAR);
            }
        }
    }

}
