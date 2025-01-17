package models;

import java.util.ArrayList;
import java.util.Scanner;

import utils.CondPosiPkmn;
import utils.Estado;
import utils.Pokemons;
import utils.Tipo;

public class Pokemon implements Cloneable {
	private Tipo tipo1, tipo2;
	private Estado estado;
	private Pokemons pokemon;
	private ArrayList<Move> movimientos;
	private ArrayList<CondPosiPkmn> pkmnCond;
	private ArrayList<Integer> durPkmnCond;
	private Entrenador entrenador;
	private String nombre;
	private int maxHP, actualHp, numero, level, attack, defence, spAttack, spDefence, speed, idPelea, turnosEstado,
			cntChngAtk, cntChngSpAtk, cntChngDef, cntChngSpDef, cntChngSpe;
	/**
	 * posicion indica la posicon que ocupa el pokemon en el combate, 0 para 1vs1,
	 * 0-1 para 2vs2 y de 0 a 2 para 3vs3
	 * 
	 * ataca indica la posicion del atacante
	 */
	private int posicion, ataca;

	/**
	 * Constructor de objeto 'Pokemon'
	 * 
	 * @param tipo1     Enum 'TipoPokemon.Tipo' que reresenta el primer tipo del
	 *                  Pokemon
	 * @param tipo2     Enum 'TipoPokemon.Tipo' que reresenta el segundo tipo del
	 *                  Pokemon
	 * @param estado    Enum 'Estado' que representa el estado que tiene aplicado el
	 *                  Pokemon
	 * @param nombre    String que representa el nombre del Pokemon
	 * @param numero    Entero que representa el numero de la Pokedex del Pokemon
	 * @param level     Entero que representa el nivel del Pokemon
	 * @param maxHP     Entero que representa la vida maxima del Pokemon
	 * @param attack    Entero que representa la potencia de ataque del Pokemon
	 * @param defence   Entero que representa la defensa del Pokemon
	 * @param spAttack  Entero que representa la potencia de ataque especial del
	 *                  Pokemon
	 * @param spDefence Entero que representa la defense especila del Pokemon
	 * @param speed     Entero que representa la velocidad del pokemon
	 */
	public Pokemon(Tipo tipo1, Tipo tipo2, Estado estado, Pokemons pokemon, String nombre, int numero, int level,
			int maxHP, int attack, int defence, int spAttack, int spDefence, int speed) {
		super();
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.estado = estado;
		this.pokemon = pokemon;
		this.movimientos = new ArrayList<Move>();
		this.pkmnCond = new ArrayList<CondPosiPkmn>();
		this.durPkmnCond = new ArrayList<Integer>();
		this.entrenador = null;
		this.nombre = nombre;
		this.maxHP = maxHP;
		this.actualHp = maxHP;
		this.numero = numero;
		this.level = level;
		this.attack = attack;
		this.defence = defence;
		this.spAttack = spAttack;
		this.spDefence = spDefence;
		this.speed = speed;
		this.posicion = -1;
		this.ataca = -1;
		this.idPelea = -1;
		this.turnosEstado = 0;
	}

	private Pokemon() {

	}

	// Getters - Setters
	public Tipo getTipo1() {
		return tipo1;
	}

	public void setTipo1(Tipo tipo1) {
		this.tipo1 = tipo1;
	}

	public Tipo getTipo2() {
		return tipo2;
	}

	public void setTipo2(Tipo tipo2) {
		this.tipo2 = tipo2;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pokemons getPokemon() {
		return pokemon;
	}

	public ArrayList<Move> getMovimientos() {
		return movimientos;
	}

	protected ArrayList<CondPosiPkmn> getPkmnCond() {
		return pkmnCond;
	}

	protected void clearPkmnCond() {
		this.pkmnCond = new ArrayList<CondPosiPkmn>();
	}

	protected void addPkmnCond(CondPosiPkmn pkmnCond) {
		this.pkmnCond.add(pkmnCond);
		this.durPkmnCond.add(-1);
	}

	protected void removePkmnCond(CondPosiPkmn pkmnCond) {
		this.pkmnCond.remove(pkmnCond);
	}

	protected boolean hasCond(CondPosiPkmn pkmnCond) {
		for (int i = 0; i < this.pkmnCond.size(); i++) {
			if (this.pkmnCond.get(i) == pkmnCond) {
				return true;
			}
		}
		return false;
	}

	protected int getPosiCond(CondPosiPkmn pkmnCond) {
		for (int i = 0; i < this.pkmnCond.size(); i++) {
			if (this.pkmnCond.get(i) == pkmnCond) {
				return i;
			}
		}
		return -1;
	}

	protected ArrayList<Integer> getDurPkmnCond() {
		return durPkmnCond;
	}

	protected void clearDurPkmnCond() {
		this.durPkmnCond = new ArrayList<Integer>();
	}

	protected void setDurPkmnCond(int posi, int durPkmnCond) {
		this.durPkmnCond.set(posi, durPkmnCond);
	}

	protected int getDurPosiPkmnCond(int posi) {
		return this.durPkmnCond.get(posi);
	}

	protected void removeDurPkmnCond(int posi) {
		this.durPkmnCond.remove(posi);
	}

	protected Entrenador getEntrenador() {
		return entrenador;
	}

	protected void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getActualHp() {
		return actualHp;
	}

	public void setActualHp(int actualHp) {
		this.actualHp = actualHp;
	}

	public int getNumero() {
		return numero;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getSpAttack() {
		return spAttack;
	}

	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}

	public int getSpDefence() {
		return spDefence;
	}

	public void setSpDefence(int spDefence) {
		this.spDefence = spDefence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getAtaca() {
		return ataca;
	}

	public void setAtaca(int ataca) {
		this.ataca = ataca;
	}

	public int getIdPelea() {
		return idPelea;
	}

	public void setIdPelea(int idPelea) {
		this.idPelea = idPelea;
	}

	public int getTurnosEstado() {
		return turnosEstado;
	}

	public void setTurnosEstado(int turnosEstado) {
		this.turnosEstado = turnosEstado;
	}

	protected int getCntChngAtk() {
		return cntChngAtk;
	}

	protected void setCntChngAtk(int cntChngAtk) {
		this.cntChngAtk = cntChngAtk;
	}

	protected int getCntChngSpAtk() {
		return cntChngSpAtk;
	}

	protected void setCntChngSpAtk(int cntChngSpAtk) {
		this.cntChngSpAtk = cntChngSpAtk;
	}

	protected int getCntChngDef() {
		return cntChngDef;
	}

	protected void setCntChngDef(int cntChngDef) {
		this.cntChngDef = cntChngDef;
	}

	protected int getCntChngSpDef() {
		return cntChngSpDef;
	}

	protected void setCntChngSpDef(int cntChngSpDef) {
		this.cntChngSpDef = cntChngSpDef;
	}

	protected int getCntChngSpe() {
		return cntChngSpe;
	}

	protected void setCntChngSpe(int cntChngSpe) {
		this.cntChngSpe = cntChngSpe;
	}

	// Methods
	/**
	 * Muestra los movimientos del pokemon
	 */
	public void mostrarMovimientos() {
		for (int i = 0; i < this.movimientos.size(); i++) {
			if (i % 2 == 0) {
				System.out.println();
			}
			System.out.print((i + 1) + ". " + this.movimientos.get(i).getNombre() + "   "
					+ this.movimientos.get(i).getActPP() + "/" + this.movimientos.get(i).getMaxPP() + " PP    \t");
		}
		System.out.println("\n");
	}

	/**
	 * Nos permite elegir un movimiento de los que posee el pokemon
	 * 
	 * @return Objeto 'Move'
	 */
	public Move elegirMovimiento() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int move;
		boolean elegido;

		do {
			System.out.println("¿Qué hará " + this.nombre + "?");
			mostrarMovimientos();
			System.out.print("->: ");
			move = Integer.parseInt(sc.nextLine());

			if (move > this.movimientos.size() || move < 1) {
				elegido = false;
				System.out.println("\n\nElige un numero valido\n");
			} else {
				elegido = true;
				return this.movimientos.get(move - 1);
			}
		} while (!elegido);
		return null;
	}

	/**
	 * Permite al pokemon aprender un movimiento
	 * 
	 * @param movimiento Objeto 'Move' que representa el movimiento que el pokemon
	 *                   va a aprender
	 */
	public void aprenderMovimiento(Move movimiento) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int move, opc;
		boolean elegido;

		if (this.movimientos.size() == 4) {
			System.out.println(this.nombre + " ya sabe 4 movimientos. ¿Cual deseas que " + this.nombre + " olvide?");

			do {
				mostrarMovimientos();
				System.out.print("\n->: ");
				move = Integer.parseInt(sc.next());

				if (move > this.movimientos.size() || move < 1) {
					elegido = false;
					System.out.println("\n\nElige un numero valido\n");
				} else {
					System.out.println("\n\n¿Olvidar " + this.movimientos.get(move - 1).getNombre() + "?");
					System.out.println("\n1.Si\n2.No\n");
					System.out.print("->: ");
					opc = Integer.parseInt(sc.nextLine());

					if (opc < 1 || opc > 2) {
						elegido = false;
						System.out.println("\n\nElige un numero valido\n");
					} else if (opc == 1) {
						elegido = true;
						this.movimientos.add(move, movimiento);
						this.movimientos.remove(move - 1);
					} else {
						elegido = false;
					}
				}
			} while (!elegido);
		} else {
			this.movimientos.add(movimiento);
		}
	}

	// Nos permiten usar a Ditto
	/**
	 * Copia las estadisticas del rival que tiene enfrente
	 * 
	 * @param rival Objeto 'Pokemon' del que estamos copiando los datos
	 */
	@SuppressWarnings("unchecked")
	public void dittoCopia(Pokemon rival) {
		this.tipo1 = rival.tipo1;
		this.tipo2 = rival.tipo2;
		this.movimientos.clear();

		ArrayList<Move> copiarDeAqui = (ArrayList<Move>) rival.movimientos.clone();

		for (Move moves : copiarDeAqui) {
			this.movimientos.add(moves.copiarMove());
		}

		for (Move moves : this.movimientos) {
			if (moves.getMaxPP() > 5)
				moves.setMaxPP(5);
			if (moves.getActPP() > 5)
				moves.setActPP(5);
		}

		this.attack = rival.attack;
		this.defence = rival.defence;
		this.spAttack = rival.spAttack;
		this.spDefence = rival.spDefence;
		this.speed = rival.speed;
	}

	/**
	 * Nos permite guardar los datos que cambian de Ditto
	 * 
	 * @return Objeto 'Pokemon' que solo tiene los datos que se copian
	 */
	@SuppressWarnings("unchecked")
	public Pokemon dittoGuardar() {
		Pokemon poke = new Pokemon();
		poke.tipo1 = this.tipo1;
		poke.tipo2 = this.tipo2;
		poke.movimientos = (ArrayList<Move>) this.movimientos.clone();
		poke.attack = this.attack;
		poke.defence = this.defence;
		poke.spAttack = this.spAttack;
		poke.spDefence = this.spDefence;
		poke.speed = this.speed;

		return poke;
	}

	/**
	 * Nos permite recuperar los datos de Ditto guardados
	 * 
	 * @param recuperar Objeto 'Pokemon'
	 */
	@SuppressWarnings("unchecked")
	public void dittoRecuperar(Pokemon recuperar) {
		this.tipo1 = recuperar.tipo1;
		this.tipo2 = recuperar.tipo2;
		this.movimientos = (ArrayList<Move>) recuperar.movimientos.clone();
		this.attack = recuperar.attack;
		this.defence = recuperar.defence;
		this.spAttack = recuperar.spAttack;
		this.spDefence = recuperar.spDefence;
		this.speed = recuperar.speed;
	}

	/**
	 * Nos permite copiar el pokemon
	 * 
	 * @return Objeto 'Pokemon'
	 */
	@SuppressWarnings("unchecked")
	public Pokemon copiarPokemon() {
		Pokemon poke = new Pokemon();
		poke.tipo1 = this.tipo1;
		poke.tipo2 = this.tipo2;
		poke.estado = this.estado;
		poke.pokemon = this.pokemon;
		poke.movimientos = (ArrayList<Move>) this.movimientos.clone();
		poke.pkmnCond = (ArrayList<CondPosiPkmn>) this.pkmnCond.clone();
		poke.durPkmnCond = (ArrayList<Integer>) this.durPkmnCond.clone();
		poke.entrenador = this.entrenador;
		poke.nombre = this.nombre;
		poke.maxHP = this.maxHP;
		poke.actualHp = this.maxHP;
		poke.numero = this.numero;
		poke.level = this.level;
		poke.attack = this.attack;
		poke.defence = this.defence;
		poke.spAttack = this.spAttack;
		poke.spDefence = this.spDefence;
		poke.speed = this.speed;
		poke.posicion = this.posicion;
		poke.ataca = this.ataca;
		poke.idPelea = this.idPelea;

		return poke;
	}

	@Override
	public String toString() {
		return "Pokemon [tipo1=" + tipo1 + ", tipo2=" + tipo2 + ", estado=" + estado + ", entrenador="
				+ entrenador.getNombre() + ", nombre=" + nombre + ", maxHP=" + maxHP + ", actualHp=" + actualHp
				+ ", level=" + level + "]";
	}

}
