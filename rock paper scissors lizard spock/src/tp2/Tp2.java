package tp2;

import javax.swing.*;

class Tp2 {

	public static void main(String[] args) {
		int ppc = 0, ptosJ = 0, pc;
		String res, pj1, pcst = " ";
		do {

			for (int i = 1; i <= 5; i++) {
				JOptionPane.showMessageDialog(null,
						"Juega contra el Bot en este Piedra, Papel, Tijeras, Lagarto y Spock\n\n*Tijeras cortan papel\n*Papel tapa a piedra\n*Piedra aplasta a lagarto\n*Lagarto envenena a Spock\n*Spock rompe tijeras\n*Tijeras decapitan lagarto\n*Lagarto devora papel\n*Papel desautoriza spock\n*Spock vaporiza piedra\n*Piedra aplasta a tijeras\n\n¿Quién ganará?",
						"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(Tp2.class.getResource("/img/inicio.gif"))); // Mensaje de inicio
				// Empieza ronda
				pj1 = (String) (JOptionPane.showInputDialog(null,
						"Ingresar jugada: \nPiedra-Papel-Tijera-Lagarto-Spock", "Prueba tu suerte",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp2.class.getResource("/img/reglas.jpg")), null,
						null)); // Ingreso mi jugada
				pc = (int) (Math.random() * 5 + 1); // tirada al azar de la pc
				System.out.println("pc: " + pc); // visualizo tirada de la pc
				switch (pc) { /// Cambio a String
				case 1:
					pcst = "Piedra";

					break;
				case 2:
					pcst = "Papel";

					break;
				case 3:
					pcst = "Tijera";

					break;
				case 4:
					pcst = "Lagarto";

					break;
				case 5:
					pcst = "Spock";

					break;
				default:
					break;
				}

				// Empezamos a preguntar
				if (pj1.equalsIgnoreCase("piedra")) { // 1° PIEDRA
					if (pcst.equalsIgnoreCase("lagarto")) { // 2° PIEDRA
						ptosJ++;
						System.out.println("Gana el Jugador");
						JOptionPane.showMessageDialog(null, "¡Piedra aplasta Lagarto!",
								"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
					} else { // 2° PIEDRA
						if (pcst.equalsIgnoreCase("tijera")) { // 3° PIEDRA
							ptosJ++;
							System.out.println("Gana el Jugador");
							JOptionPane.showMessageDialog(null, "¡Piedra aplasta a tijeras!",
									"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
						} else { // 3° PIEDRA
							if (pcst.equalsIgnoreCase("papel")) { // 4° PIEDRA
								ppc++;
								System.out.println("Gana la PC");
								JOptionPane.showMessageDialog(null, "¡Papel tapa a piedra!",
										"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
										new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
							} else { // 4° PIEDRA
								if (pcst.equalsIgnoreCase("spock")) { // 5° PIEDRA
									ppc++;
									System.out.println("Gana la PC");
									JOptionPane.showMessageDialog(null, "¡Spock vaporiza a piedra!",
											"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
								} else { // 4°PIEDRA
									ppc = ppc + 0;
									ptosJ = ptosJ + 0;
									System.out.println("Hay empate");
									JOptionPane.showMessageDialog(null, "¡Piedra vs Piedra se anula!",
											"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Tp2.class.getResource("/img/omg.jpg")));
								}
							}
						}
					} // CERRAMOS PIEDRA
				} else { // 1°
					if (pj1.equalsIgnoreCase("papel")) { // 1°PAPEL
						if (pcst.equalsIgnoreCase("piedra")) {// 2° PAPEL
							ptosJ++;
							System.out.println("Gana el Jugador");
							JOptionPane.showMessageDialog(null, "¡Papel tapa a Piedra!",
									"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
						} else { // 2°PAPEL
							if (pcst.equalsIgnoreCase("spock")) {// 3°papel
								ptosJ++;
								System.out.println("Gana el Jugador");
								JOptionPane.showMessageDialog(null, "¡Papel desautoriza a Spock!",
										"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
										new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
							} else {// 3°papel
								if (pcst.equalsIgnoreCase("tijera")) {// 4°papel
									ppc++;
									System.out.println("Gana la PC");
									JOptionPane.showMessageDialog(null, "¡Tijeras cortan Papel!",
											"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
								} else { // 4°papel
									if (pcst.equalsIgnoreCase("lagarto")) { // 5°papel
										ppc++;
										System.out.println("Gana la PC");
										JOptionPane.showMessageDialog(null, "¡Lagarto devora papel!",
												"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
												new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
									} else { // 5°papel
										ptosJ = ptosJ + 0;
										ppc = ppc + 0;
										System.out.println("Hay empate");
										JOptionPane.showMessageDialog(null, "¡Papel vs Papel se anula!",
												"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
												new ImageIcon(Tp2.class.getResource("/img/omg.jpg")));
									}
								}
							}
						}
					} else { // 1° PAPEL
						if (pj1.equalsIgnoreCase("tijera")) { // 1°Tijera
							if (pcst.equalsIgnoreCase("papel")) {// 2°tijera
								ptosJ++;
								System.out.println("Gana el Jugador");
								JOptionPane.showMessageDialog(null, "¡Tijeras cortan Papel!",
										"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
										new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
							} else {// 2°tijera
								if (pcst.equalsIgnoreCase("lagarto")) { // 3°tijera
									ptosJ++;
									System.out.println("Gana el Jugador");
									JOptionPane.showMessageDialog(null, "¡Tijeras decapitan Lagarto!",
											"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
								} else { // 3°tijera
									if (pcst.equalsIgnoreCase("piedra")) {// 4°tijera
										ppc++;
										System.out.println("Gana la PC");
										JOptionPane.showMessageDialog(null, "¡Piedra aplasta a Tijeras!",
												"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
												new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
									} else { // 4°tijera
										if (pcst.equalsIgnoreCase("spock")) {// 5°tijera
											ppc++;
											System.out.println("Gana la pc");
											JOptionPane.showMessageDialog(null, "¡Spock rompe Tijeras!",
													"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
													new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
										} else { // 5°tijera
											ptosJ = ptosJ + 0;
											ppc = ppc + 0;
											System.out.println("Hay empate");
											JOptionPane.showMessageDialog(null, "¡Tijera vs Tijera se anula!",
													"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
													new ImageIcon(Tp2.class.getResource("/img/omg.jpg")));
										}
									}
								}
							}
						} else {// 1°tijera
							if (pj1.equalsIgnoreCase("lagarto")) {// 1°lagarto
								if (pcst.equalsIgnoreCase("spock")) {// 2°lagarto
									ptosJ++;
									System.out.println("Gana el Jugador");
									JOptionPane.showMessageDialog(null, "¡Lagarto envenena a Spock!",
											"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
								} else { // 2°lagarto
									if (pcst.equalsIgnoreCase("papel")) {// 3°lagarto
										ptosJ++;
										System.out.println("Gana el Jugador");
										JOptionPane.showMessageDialog(null, "¡Lagarto devora Papel!",
												"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
												new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
									} else {// 3°lagarto
										if (pcst.equalsIgnoreCase("piedra")) { // 4°lagarto
											ppc++;
											System.out.println("Gana la PC");
											JOptionPane.showMessageDialog(null, "¡Piedra aplasta a Lagarto!",
													"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
													new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
										} else { // 4°lagarto
											if (pcst.equalsIgnoreCase("tijera")) { // 5°lagarto
												ppc++;
												System.out.println("Gana la PC");
												JOptionPane.showMessageDialog(null, "¡Tijeras decapitan Lagarto!",
														"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
														new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
											} else { // 5°lagarto
												ptosJ = ptosJ + 0;
												ppc = ppc + 0;
												System.out.println("Hay empate");
												JOptionPane.showMessageDialog(null, "¡Lagarto vs Lagarto se anula!",
														"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
														new ImageIcon(Tp2.class.getResource("/img/omg.jpg")));
											}
										}
									}
								}
							} else {// 1°lagarto
								if (pj1.equalsIgnoreCase("spock")) { // 1°Spock
									if (pcst.equalsIgnoreCase("tijera")) {// 2°spock
										ptosJ++;
										System.out.println("Gana el Jugador");
										JOptionPane.showMessageDialog(null, "¡Spock rompe Tijeras!",
												"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
												new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
									} else {// 2°spock
										if (pcst.equalsIgnoreCase("piedra")) {// 3°spock
											ptosJ++;
											System.out.println("Gana el Jugador");
											JOptionPane.showMessageDialog(null, "¡Spock vaporiza a piedra!",
													"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
													new ImageIcon(Tp2.class.getResource("/img/si.jpg")));
										} else {// 3°spock
											if (pcst.equalsIgnoreCase("lagarto")) {// 4°spock
												ppc++;
												System.out.println("Gana la PC");
												JOptionPane.showMessageDialog(null, "¡Lagarto envenena a Spock!",
														"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
														new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
											} else {// 4°spock
												if (pcst.equalsIgnoreCase("papel")) {// 5°spock
													ppc++;
													System.out.println("Gana la PC");
													JOptionPane.showMessageDialog(null, "¡Papel desautoriza a Spock!",
															"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
															new ImageIcon(Tp2.class.getResource("/img/no.jpg")));
												} else { // 5°spock
													ptosJ = ptosJ + 0;
													ppc = ppc + 0;
													System.out.println("Hay empate");
													JOptionPane.showMessageDialog(null, "¡Spock vs Spock se anula!",
															"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
															new ImageIcon(Tp2.class.getResource("/img/omg.jpg")));
												}
											}
										}
									}
								} else {// 1°Spock
									JOptionPane.showMessageDialog(null, "*******ERROR EN EL INGRESO*******",
											"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.PLAIN_MESSAGE,
											new ImageIcon(Tp2.class.getResource("/img/error.gif")));
								}
							}
						}
					}
				} // Termina ronda

				JOptionPane.showMessageDialog(null, "Total de puntos:\nJugador: " + ptosJ + " vs PC: " + ppc,
						"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Tp2.class.getResource("/img/reglas.jpg")));

			} // ACA TERMINA EL FOR
				// empieza if resultados
			if (ptosJ > ppc) { // 1°
				JOptionPane.showMessageDialog(null, "*******HAS GANADO*******\n¡¡¡FELICITACIONES!!!",
						"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(Tp2.class.getResource("/img/win.gif")));
			} else {// 1°
				if (ppc > ptosJ) {// 2°
					JOptionPane.showMessageDialog(null, "*******HAS PERDIDO*******\n¡¡¡MEJOR SUERTE PARA LA PRÓXIMA!!!",
							"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(Tp2.class.getResource("/img/lose.gif")));
				} else {// 2°
					if (ppc == ptosJ) {// 3°
						JOptionPane.showMessageDialog(null, "*******HAY EMPATE*******\nCASI CASI, PERO NO...",
								"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(Tp2.class.getResource("/img/empate.gif")));
					} else {// 3°
						JOptionPane.showMessageDialog(null, "*******ERROR EN EL INGRESO*******",
								"Piedra, Papel, Tijeras, Lagarto y Spock", JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(Tp2.class.getResource("/img/error.gif")));
					}
				}
			}
			res = (String) (JOptionPane.showInputDialog(null, "¿Quiere volver a jugar?\nSi o No",
					"Piedra-Papel-Tijera-Lagarto-Spock", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp2.class.getResource("/img/inicio.gif")), null, null));
		} while (res.equalsIgnoreCase("Si"));
	}

}
