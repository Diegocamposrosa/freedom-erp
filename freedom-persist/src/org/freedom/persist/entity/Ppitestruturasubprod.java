package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ppitestruturasubprod generated by hbm2java
 */
@Entity
@Table(name = "PPITESTRUTURASUBPROD")
public class Ppitestruturasubprod implements java.io.Serializable {

	private PpitestruturasubprodId id;
	private Ppestrufase ppestrufase;
	private Eqproduto eqproduto;
	private String refprod;
	private String refprodpd;
	private BigDecimal qtditestsp;
	private char qtdvariavel;
	private char qtdfixa;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppitestruturasubprod() {
	}

	public Ppitestruturasubprod(PpitestruturasubprodId id,
			Ppestrufase ppestrufase, Eqproduto eqproduto,
			BigDecimal qtditestsp, char qtdvariavel, char qtdfixa,
			char emmanut, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.ppestrufase = ppestrufase;
		this.eqproduto = eqproduto;
		this.qtditestsp = qtditestsp;
		this.qtdvariavel = qtdvariavel;
		this.qtdfixa = qtdfixa;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppitestruturasubprod(PpitestruturasubprodId id,
			Ppestrufase ppestrufase, Eqproduto eqproduto, String refprod,
			String refprodpd, BigDecimal qtditestsp, char qtdvariavel,
			char qtdfixa, char emmanut, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.ppestrufase = ppestrufase;
		this.eqproduto = eqproduto;
		this.refprod = refprod;
		this.refprodpd = refprodpd;
		this.qtditestsp = qtditestsp;
		this.qtdvariavel = qtdvariavel;
		this.qtdfixa = qtdfixa;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD", nullable = false)),
			@AttributeOverride(name = "seqest", column = @Column(name = "SEQEST", nullable = false)),
			@AttributeOverride(name = "seqitestsp", column = @Column(name = "SEQITESTSP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpitestruturasubprodId getId() {
		return this.id;
	}

	public void setId(PpitestruturasubprodId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQEST", referencedColumnName = "SEQEST", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQEF", referencedColumnName = "SEQEF", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFASE", referencedColumnName = "CODFASE", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALFS", referencedColumnName = "CODFILIALFS", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPFS", referencedColumnName = "CODEMPFS", nullable = false, insertable = false, updatable = false) })
	public Ppestrufase getPpestrufase() {
		return this.ppestrufase;
	}

	public void setPpestrufase(Ppestrufase ppestrufase) {
		this.ppestrufase = ppestrufase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPRODPD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@Column(name = "REFPROD", length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "REFPRODPD", length = 20)
	public String getRefprodpd() {
		return this.refprodpd;
	}

	public void setRefprodpd(String refprodpd) {
		this.refprodpd = refprodpd;
	}

	@Column(name = "QTDITESTSP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditestsp() {
		return this.qtditestsp;
	}

	public void setQtditestsp(BigDecimal qtditestsp) {
		this.qtditestsp = qtditestsp;
	}

	@Column(name = "QTDVARIAVEL", nullable = false, length = 1)
	public char getQtdvariavel() {
		return this.qtdvariavel;
	}

	public void setQtdvariavel(char qtdvariavel) {
		this.qtdvariavel = qtdvariavel;
	}

	@Column(name = "QTDFIXA", nullable = false, length = 1)
	public char getQtdfixa() {
		return this.qtdfixa;
	}

	public void setQtdfixa(char qtdfixa) {
		this.qtdfixa = qtdfixa;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
