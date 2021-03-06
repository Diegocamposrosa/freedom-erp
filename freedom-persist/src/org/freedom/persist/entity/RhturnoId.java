package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RhturnoId generated by hbm2java
 */
@Embeddable
public class RhturnoId implements java.io.Serializable {

	private short codturno;
	private short codfilial;
	private int codemp;

	public RhturnoId() {
	}

	public RhturnoId(short codturno, short codfilial, int codemp) {
		this.codturno = codturno;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTURNO", nullable = false)
	public short getCodturno() {
		return this.codturno;
	}

	public void setCodturno(short codturno) {
		this.codturno = codturno;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RhturnoId))
			return false;
		RhturnoId castOther = (RhturnoId) other;

		return (this.getCodturno() == castOther.getCodturno())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodturno();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
