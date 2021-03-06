package org.tahom.repository.type.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class Results implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String DELITEMER_PLUS = "+";
	private static final String DELITEMER_COMMA = ",";
	private static final String DELITEMER_REG_EXP = "\\" + DELITEMER_PLUS + "|" + DELITEMER_COMMA;

	private List<Result> results = new ArrayList<Result>();
	private boolean temp = false;

	public Results() {
	}

	public Results(boolean temp) {
		this.temp = temp;
	}

	public Results(String results) {
		for (String result : results.split(DELITEMER_REG_EXP)) {
			this.results.add(new Result(result));
		}
	}

	public Results revert() {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < results.size(); i++) {
			if (i > 0) {
				builder.append(DELITEMER_COMMA);
			}
			builder.append(results.get(i).revert());
		}
		return new Results(builder.toString());
	}

	@Override
	public String toString() {
		return toString(DELITEMER_COMMA);
	}

	public String toString(String delimeter) {
		if (temp) {
			return "X";
		}
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < results.size(); i++) {
			if (i > 0) {
				builder.append(delimeter);
				builder.append(" ");
			}
			builder.append(results.get(i).toString());
		}

		return builder.toString();
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

}
