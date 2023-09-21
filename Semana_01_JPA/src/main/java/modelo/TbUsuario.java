package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_usuarios database table.
 * 
 */
@Entity
@Table(name="tb_usuarios")
@NamedQuery(name="TbUsuario.findAll", query="SELECT t FROM TbUsuario t")
public class TbUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_usua")
	private int codUsua;

	@Column(name="ape_usua")
	private String apeUsua;

	@Column(name="cla_usua")
	private String claUsua;

	@Column(name="est_usua")
	private int estUsua;

	@Temporal(TemporalType.DATE)
	@Column(name="fna_usua")
	private Date fnaUsua;

	private int idtipo;

	@Column(name="nom_usua")
	private String nomUsua;

	@Column(name="usr_usua")
	private String usrUsua;

	public TbUsuario() {
	}

	public int getCodUsua() {
		return this.codUsua;
	}

	public void setCodUsua(int codUsua) {
		this.codUsua = codUsua;
	}

	public String getApeUsua() {
		return this.apeUsua;
	}

	public void setApeUsua(String apeUsua) {
		this.apeUsua = apeUsua;
	}

	public String getClaUsua() {
		return this.claUsua;
	}

	public void setClaUsua(String claUsua) {
		this.claUsua = claUsua;
	}

	public int getEstUsua() {
		return this.estUsua;
	}

	public void setEstUsua(int estUsua) {
		this.estUsua = estUsua;
	}

	public Date getFnaUsua() {
		return this.fnaUsua;
	}

	public void setFnaUsua(Date fnaUsua) {
		this.fnaUsua = fnaUsua;
	}

	public int getIdtipo() {
		return this.idtipo;
	}

	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}

	public String getNomUsua() {
		return this.nomUsua;
	}

	public void setNomUsua(String nomUsua) {
		this.nomUsua = nomUsua;
	}

	public String getUsrUsua() {
		return this.usrUsua;
	}

	public void setUsrUsua(String usrUsua) {
		this.usrUsua = usrUsua;
	}

}