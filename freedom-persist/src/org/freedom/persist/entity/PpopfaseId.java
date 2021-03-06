package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PpopfaseId generated by hbm2java
 */
@Embeddable
public class PpopfaseId implements java.io.Serializable {

	private int codop;
	private short seqop;
	private short seqof;
	private short codfilial;
	private int codemp;

	public PpopfaseId() {
	}

	public PpopfaseId(int codop, short seqop, short seqof, short codfilial,
			int codemp) {
		this.codop = codop;
		this.seqop = seqop;
		this.seqof = seqof;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODOP", nullable = false)
	public int getCodop() {
		return this.codop;
	}

	public void setCodop(int codop) {
		this.codop = codop;
	}

	@Column(name = "SEQOP", nullable = false)
	public short getSeqop() {
		return this.seqop;
	}

	public void setSeqop(short seqop) {
		this.seqop = seqop;
	}

	@Column(name = "SEQOF", nullable = false)
	public short getSeqof() {
		return this.seqof;
	}

	public void setSeqof(short seqof) {
		this.seqof = seqof;
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
		if (!(other instanceof PpopfaseId))
			return false;
		PpopfaseId castOther = (PpopfaseId) other;

		return (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getSeqof() == castOther.getSeqof())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getSeqof();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
