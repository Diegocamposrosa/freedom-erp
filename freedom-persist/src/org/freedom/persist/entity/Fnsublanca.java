package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fnsublanca generated by hbm2java
 */
@Entity
@Table(name = "FNSUBLANCA")
public class Fnsublanca implements java.io.Serializable {

	private FnsublancaId id;
	private Fnitpagar fnitpagar;
	private Fnitreceber fnitreceber;
	private Rhempregado rhempregado;
	private Cpforneced cpforneced;
	private Vdcliente vdcliente;
	private Fnplanejamento fnplanejamento;
	private Vditcontrato vditcontrato;
	private Fnlanca fnlanca;
	private Fncc fncc;
	private String statussublanca;
	private Character origsublanca;
	private Date dtcompsublanca;
	private Date dtprevsublanca;
	private char tiposublanca;
	private Date datasublanca;
	private BigDecimal vlrsublanca;
	private Character flag;
	private String histsublanca;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdconsignacaosForVdconsigfkfnsublancadev = new HashSet(0);
	private Set vdvendaconsigsForVdvendaconsigfkfnsublanca = new HashSet(0);
	private Set vdconsignacaosForVdconsigfkfnsublanca = new HashSet(0);
	private Set vdvendaconsigsForVdvendaconsigfkfnsublancasc = new HashSet(0);

	public Fnsublanca() {
	}

	public Fnsublanca(FnsublancaId id, Fnplanejamento fnplanejamento,
			Fnlanca fnlanca, String statussublanca, Date dtcompsublanca,
			char tiposublanca, char emmanut, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.fnplanejamento = fnplanejamento;
		this.fnlanca = fnlanca;
		this.statussublanca = statussublanca;
		this.dtcompsublanca = dtcompsublanca;
		this.tiposublanca = tiposublanca;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnsublanca(FnsublancaId id, Fnitpagar fnitpagar,
			Fnitreceber fnitreceber, Rhempregado rhempregado,
			Cpforneced cpforneced, Vdcliente vdcliente,
			Fnplanejamento fnplanejamento, Vditcontrato vditcontrato,
			Fnlanca fnlanca, Fncc fncc, String statussublanca,
			Character origsublanca, Date dtcompsublanca, Date dtprevsublanca,
			char tiposublanca, Date datasublanca, BigDecimal vlrsublanca,
			Character flag, String histsublanca, char emmanut, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdconsignacaosForVdconsigfkfnsublancadev,
			Set vdvendaconsigsForVdvendaconsigfkfnsublanca,
			Set vdconsignacaosForVdconsigfkfnsublanca,
			Set vdvendaconsigsForVdvendaconsigfkfnsublancasc) {
		this.id = id;
		this.fnitpagar = fnitpagar;
		this.fnitreceber = fnitreceber;
		this.rhempregado = rhempregado;
		this.cpforneced = cpforneced;
		this.vdcliente = vdcliente;
		this.fnplanejamento = fnplanejamento;
		this.vditcontrato = vditcontrato;
		this.fnlanca = fnlanca;
		this.fncc = fncc;
		this.statussublanca = statussublanca;
		this.origsublanca = origsublanca;
		this.dtcompsublanca = dtcompsublanca;
		this.dtprevsublanca = dtprevsublanca;
		this.tiposublanca = tiposublanca;
		this.datasublanca = datasublanca;
		this.vlrsublanca = vlrsublanca;
		this.flag = flag;
		this.histsublanca = histsublanca;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdconsignacaosForVdconsigfkfnsublancadev = vdconsignacaosForVdconsigfkfnsublancadev;
		this.vdvendaconsigsForVdvendaconsigfkfnsublanca = vdvendaconsigsForVdvendaconsigfkfnsublanca;
		this.vdconsignacaosForVdconsigfkfnsublanca = vdconsignacaosForVdconsigfkfnsublanca;
		this.vdvendaconsigsForVdvendaconsigfkfnsublancasc = vdvendaconsigsForVdvendaconsigfkfnsublancasc;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsublanca", column = @Column(name = "CODSUBLANCA", nullable = false)),
			@AttributeOverride(name = "codlanca", column = @Column(name = "CODLANCA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnsublancaId getId() {
		return this.id;
	}

	public void setId(FnsublancaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPAG", referencedColumnName = "CODPAG"),
			@JoinColumn(name = "NPARCPAG", referencedColumnName = "NPARCPAG"),
			@JoinColumn(name = "CODFILIALPG", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPG", referencedColumnName = "CODEMP") })
	public Fnitpagar getFnitpagar() {
		return this.fnitpagar;
	}

	public void setFnitpagar(Fnitpagar fnitpagar) {
		this.fnitpagar = fnitpagar;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODREC", referencedColumnName = "CODREC"),
			@JoinColumn(name = "NPARCITREC", referencedColumnName = "NPARCITREC"),
			@JoinColumn(name = "CODFILIALRC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPRC", referencedColumnName = "CODEMP") })
	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "MATEMPR", referencedColumnName = "MATEMPR"),
			@JoinColumn(name = "CODFILIALEM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPEM", referencedColumnName = "CODEMP") })
	public Rhempregado getRhempregado() {
		return this.rhempregado;
	}

	public void setRhempregado(Rhempregado rhempregado) {
		this.rhempregado = rhempregado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFOR", referencedColumnName = "CODFOR"),
			@JoinColumn(name = "CODFILIALFR", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPFR", referencedColumnName = "CODEMP") })
	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI"),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP") })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLAN", referencedColumnName = "CODPLAN", nullable = false),
			@JoinColumn(name = "CODFILIALPN", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPN", referencedColumnName = "CODEMP", nullable = false) })
	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONTR", referencedColumnName = "CODCONTR"),
			@JoinColumn(name = "CODITCONTR", referencedColumnName = "CODITCONTR"),
			@JoinColumn(name = "CODFILIALCT", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCT", referencedColumnName = "CODEMP") })
	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODLANCA", referencedColumnName = "CODLANCA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Fnlanca getFnlanca() {
		return this.fnlanca;
	}

	public void setFnlanca(Fnlanca fnlanca) {
		this.fnlanca = fnlanca;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCC", referencedColumnName = "CODCC"),
			@JoinColumn(name = "ANOCC", referencedColumnName = "ANOCC"),
			@JoinColumn(name = "CODFILIALCC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCC", referencedColumnName = "CODEMP") })
	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	@Column(name = "STATUSSUBLANCA", nullable = false, length = 2)
	public String getStatussublanca() {
		return this.statussublanca;
	}

	public void setStatussublanca(String statussublanca) {
		this.statussublanca = statussublanca;
	}

	@Column(name = "ORIGSUBLANCA", length = 1)
	public Character getOrigsublanca() {
		return this.origsublanca;
	}

	public void setOrigsublanca(Character origsublanca) {
		this.origsublanca = origsublanca;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCOMPSUBLANCA", nullable = false, length = 10)
	public Date getDtcompsublanca() {
		return this.dtcompsublanca;
	}

	public void setDtcompsublanca(Date dtcompsublanca) {
		this.dtcompsublanca = dtcompsublanca;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVSUBLANCA", length = 10)
	public Date getDtprevsublanca() {
		return this.dtprevsublanca;
	}

	public void setDtprevsublanca(Date dtprevsublanca) {
		this.dtprevsublanca = dtprevsublanca;
	}

	@Column(name = "TIPOSUBLANCA", nullable = false, length = 1)
	public char getTiposublanca() {
		return this.tiposublanca;
	}

	public void setTiposublanca(char tiposublanca) {
		this.tiposublanca = tiposublanca;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATASUBLANCA", length = 10)
	public Date getDatasublanca() {
		return this.datasublanca;
	}

	public void setDatasublanca(Date datasublanca) {
		this.datasublanca = datasublanca;
	}

	@Column(name = "VLRSUBLANCA", precision = 15, scale = 5)
	public BigDecimal getVlrsublanca() {
		return this.vlrsublanca;
	}

	public void setVlrsublanca(BigDecimal vlrsublanca) {
		this.vlrsublanca = vlrsublanca;
	}

	@Column(name = "FLAG", length = 1)
	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	@Column(name = "HISTSUBLANCA", length = 250)
	public String getHistsublanca() {
		return this.histsublanca;
	}

	public void setHistsublanca(String histsublanca) {
		this.histsublanca = histsublanca;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnsublancaByVdconsigfkfnsublancadev")
	public Set getVdconsignacaosForVdconsigfkfnsublancadev() {
		return this.vdconsignacaosForVdconsigfkfnsublancadev;
	}

	public void setVdconsignacaosForVdconsigfkfnsublancadev(
			Set vdconsignacaosForVdconsigfkfnsublancadev) {
		this.vdconsignacaosForVdconsigfkfnsublancadev = vdconsignacaosForVdconsigfkfnsublancadev;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnsublancaByVdvendaconsigfkfnsublanca")
	public Set getVdvendaconsigsForVdvendaconsigfkfnsublanca() {
		return this.vdvendaconsigsForVdvendaconsigfkfnsublanca;
	}

	public void setVdvendaconsigsForVdvendaconsigfkfnsublanca(
			Set vdvendaconsigsForVdvendaconsigfkfnsublanca) {
		this.vdvendaconsigsForVdvendaconsigfkfnsublanca = vdvendaconsigsForVdvendaconsigfkfnsublanca;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnsublancaByVdconsigfkfnsublanca")
	public Set getVdconsignacaosForVdconsigfkfnsublanca() {
		return this.vdconsignacaosForVdconsigfkfnsublanca;
	}

	public void setVdconsignacaosForVdconsigfkfnsublanca(
			Set vdconsignacaosForVdconsigfkfnsublanca) {
		this.vdconsignacaosForVdconsigfkfnsublanca = vdconsignacaosForVdconsigfkfnsublanca;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnsublancaByVdvendaconsigfkfnsublancasc")
	public Set getVdvendaconsigsForVdvendaconsigfkfnsublancasc() {
		return this.vdvendaconsigsForVdvendaconsigfkfnsublancasc;
	}

	public void setVdvendaconsigsForVdvendaconsigfkfnsublancasc(
			Set vdvendaconsigsForVdvendaconsigfkfnsublancasc) {
		this.vdvendaconsigsForVdvendaconsigfkfnsublancasc = vdvendaconsigsForVdvendaconsigfkfnsublancasc;
	}
	*/

}
