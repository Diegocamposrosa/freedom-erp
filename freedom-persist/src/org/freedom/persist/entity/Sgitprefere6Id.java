package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Sgitprefere6Id generated by hbm2java
 */
@Embeddable
public class Sgitprefere6Id implements java.io.Serializable {

	private String codbanco;
	private String tipofebraban;
	private short codfilialbo;
	private int codempbo;
	private short codfilial;
	private int codemp;

	public Sgitprefere6Id() {
	}

	public Sgitprefere6Id(String codbanco, String tipofebraban,
			short codfilialbo, int codempbo, short codfilial, int codemp) {
		this.codbanco = codbanco;
		this.tipofebraban = tipofebraban;
		this.codfilialbo = codfilialbo;
		this.codempbo = codempbo;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODBANCO", nullable = false, length = 3)
	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	@Column(name = "TIPOFEBRABAN", nullable = false, length = 2)
	public String getTipofebraban() {
		return this.tipofebraban;
	}

	public void setTipofebraban(String tipofebraban) {
		this.tipofebraban = tipofebraban;
	}

	@Column(name = "CODFILIALBO", nullable = false)
	public short getCodfilialbo() {
		return this.codfilialbo;
	}

	public void setCodfilialbo(short codfilialbo) {
		this.codfilialbo = codfilialbo;
	}

	@Column(name = "CODEMPBO", nullable = false)
	public int getCodempbo() {
		return this.codempbo;
	}

	public void setCodempbo(int codempbo) {
		this.codempbo = codempbo;
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
		if (!(other instanceof Sgitprefere6Id))
			return false;
		Sgitprefere6Id castOther = (Sgitprefere6Id) other;

		return ((this.getCodbanco() == castOther.getCodbanco()) || (this
				.getCodbanco() != null && castOther.getCodbanco() != null && this
				.getCodbanco().equals(castOther.getCodbanco())))
				&& ((this.getTipofebraban() == castOther.getTipofebraban()) || (this
						.getTipofebraban() != null
						&& castOther.getTipofebraban() != null && this
						.getTipofebraban().equals(castOther.getTipofebraban())))
				&& (this.getCodfilialbo() == castOther.getCodfilialbo())
				&& (this.getCodempbo() == castOther.getCodempbo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodbanco() == null ? 0 : this.getCodbanco().hashCode());
		result = 37
				* result
				+ (getTipofebraban() == null ? 0 : this.getTipofebraban()
						.hashCode());
		result = 37 * result + this.getCodfilialbo();
		result = 37 * result + this.getCodempbo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
