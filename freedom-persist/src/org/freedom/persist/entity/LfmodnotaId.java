package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LfmodnotaId generated by hbm2java
 */
@Embeddable
public class LfmodnotaId implements java.io.Serializable {

	private int codmodnota;
	private short codfilial;
	private int codemp;

	public LfmodnotaId() {
	}

	public LfmodnotaId(int codmodnota, short codfilial, int codemp) {
		this.codmodnota = codmodnota;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODMODNOTA", nullable = false)
	public int getCodmodnota() {
		return this.codmodnota;
	}

	public void setCodmodnota(int codmodnota) {
		this.codmodnota = codmodnota;
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
		if (!(other instanceof LfmodnotaId))
			return false;
		LfmodnotaId castOther = (LfmodnotaId) other;

		return (this.getCodmodnota() == castOther.getCodmodnota())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmodnota();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
