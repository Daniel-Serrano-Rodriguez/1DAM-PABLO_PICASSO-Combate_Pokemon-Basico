package models;

import models.TipoPokemon.Tipo;
import utils.CondArena;
import utils.CondPosiPkmn;
import utils.Estado;

public class MoveAtk extends AbstractMove {

	/**
	 * Constructor del objeto 'MoveAtk', que son ataques con un daño específico
	 * 
	 * @param aplicaEstado Enum 'Estado' que representa el estado que se aplica al
	 *                     objeto 'Pokemon'
	 * @param tipo         Enum 'TipoPokemon.Tipo' que representa el tipo del
	 *                     movimiento
	 * @param nombre       String que representa el nombre del movimiento
	 * @param maxPP        Entero que representa los max PP del movimiento
	 * @param actPP        Entero que representa los PP actuales del movimiento
	 * @param damage       Entero que representa el daño (power) del movimiento
	 * @param chnAtkYou    Entero que representa cuantos niveles cambia a tu ataque
	 *                     (0, 1, 2, 3)
	 * @param chnAtkRiv    Entero que representa cuantos niveles cambia al ataque
	 *                     del rival (0, 1, 2, 3)
	 * @param chnDefYou    Entero que representa cuantos niveles cambia a tu defensa
	 *                     (0, 1, 2, 3)
	 * @param chnDefRiv    Entero que representa cuantos niveles cambia a la defensa
	 *                     del rival (0, 1, 2, 3)
	 * @param chnSpAtkYou  Entero que representa cuantos niveles cambia a tu ataque
	 *                     especial (0, 1, 2, 3)
	 * @param chnSpAtkRiv  Entero que representa cuantos niveles cambia al ataque
	 *                     especial del rival (0, 1, 2, 3)
	 * @param chnSpDefYou  Entero que representa cuantos niveles cambia a tu defensa
	 *                     especial (0, 1, 2, 3)
	 * @param chnSpDefRiv  Entero que representa cuantos niveles cambia a la defensa
	 *                     especial del rival (0, 1, 2, 3)
	 * @param chnSpeYou    Entero que representa cuantos niveles cambia a tu
	 *                     velocidad (0, 1, 2, 3)
	 * @param chnSpeRiv    Entero que representa cuantos niveles cambia a la
	 *                     velocidad del rival (0, 1, 2, 3)
	 */
	public MoveAtk(Estado aplicaEstado, Tipo tipo, String nombre, int maxPP, int damage, int chnAtkYou,
			int chnAtkRiv, int chnDefYou, int chnDefRiv, int chnSpAtkYou, int chnSpAtkRiv, int chnSpDefYou,
			int chnSpDefRiv, int chnSpeYou, int chnSpeRiv) {
		super(aplicaEstado, CondArena.Ninguno, CondPosiPkmn.Ninguno, tipo, nombre, maxPP, damage, chnAtkYou, chnAtkRiv,
				chnDefYou, chnDefRiv, chnSpAtkYou, chnSpAtkRiv, chnSpDefYou, chnSpDefRiv, chnSpeYou, chnSpeRiv);
	}

}
