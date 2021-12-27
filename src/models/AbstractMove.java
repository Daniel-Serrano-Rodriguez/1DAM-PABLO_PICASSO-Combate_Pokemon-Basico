package models;

import models.TipoPokemon.Tipo;
import utils.CondArena;
import utils.CondPosiPkmn;
import utils.Estado;

public abstract class AbstractMove {
	private Estado aplicaEstado;
	private CondArena aplicaCondArena;
	private CondPosiPkmn aplicaCondPosiPkmn;
	private Tipo tipo;
	private String nombre;
	private int maxPP, actPP, damage, chnAtkYou, chnAtkRiv, chnDefYou, chnDefRiv, chnSpAtkYou, chnSpAtkRiv, chnSpDefYou,
			chnSpDefRiv, chnSpeYou, chnSpeRiv;

	// Const
	/**
	 * Constructor del objeto 'AbstractMove'
	 * 
	 * @param aplicaEstado Estado que aplica
	 * @param tipo
	 * @param nombre
	 * @param maxPP
	 * @param actPP
	 * @param damage
	 * @param chnAtkYou
	 * @param chnAtkRiv
	 * @param chnDefYou
	 * @param chnDefRiv
	 * @param chnSpAtkYou
	 * @param chnSpAtkRiv
	 * @param chnSpDefYou
	 * @param chnSpDefRiv
	 * @param chnSpeYou
	 * @param chnSpeRiv
	 */
	protected AbstractMove(Estado aplicaEstado, CondArena aplicaCondArena, CondPosiPkmn aplicaCondPosiPkmn, Tipo tipo,
			String nombre, int maxPP, int actPP, int damage, int chnAtkYou, int chnAtkRiv, int chnDefYou, int chnDefRiv,
			int chnSpAtkYou, int chnSpAtkRiv, int chnSpDefYou, int chnSpDefRiv, int chnSpeYou, int chnSpeRiv) {
		super();
		this.aplicaEstado = aplicaEstado;
		this.aplicaCondArena = aplicaCondArena;
		this.aplicaCondPosiPkmn = aplicaCondPosiPkmn;
		this.tipo = tipo;
		this.nombre = nombre;
		this.maxPP = maxPP;
		this.actPP = actPP;
		this.damage = damage;
		this.chnAtkYou = chnAtkYou;
		this.chnAtkRiv = chnAtkRiv;
		this.chnDefYou = chnDefYou;
		this.chnDefRiv = chnDefRiv;
		this.chnSpAtkYou = chnSpAtkYou;
		this.chnSpAtkRiv = chnSpAtkRiv;
		this.chnSpDefYou = chnSpDefYou;
		this.chnSpDefRiv = chnSpDefRiv;
		this.chnSpeYou = chnSpeYou;
		this.chnSpeRiv = chnSpeRiv;
	}

	// Getters - Setters
	protected Estado getAplicaEstado() {
		return aplicaEstado;
	}

	protected Tipo getTipo() {
		return tipo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected int getMaxPP() {
		return maxPP;
	}

	protected void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}

	protected int getActPP() {
		return actPP;
	}

	protected void setActPP(int actPP) {
		this.actPP = actPP;
	}

	protected int getDamage() {
		return damage;
	}

	protected void setDamage(int damage) {
		this.damage = damage;
	}

	protected int getChnAtkYou() {
		return chnAtkYou;
	}

	protected int getChnAtkRiv() {
		return chnAtkRiv;
	}

	protected int getChnDefYou() {
		return chnDefYou;
	}

	protected int getChnDefRiv() {
		return chnDefRiv;
	}

	protected int getChnSpAtkYou() {
		return chnSpAtkYou;
	}

	protected int getChnSpAtkRiv() {
		return chnSpAtkRiv;
	}

	protected int getChnSpDefYou() {
		return chnSpDefYou;
	}

	protected int getChnSpDefRiv() {
		return chnSpDefRiv;
	}

	protected int getChnSpeYou() {
		return chnSpeYou;
	}

	protected int getChnSpeRiv() {
		return chnSpeRiv;
	}

}
