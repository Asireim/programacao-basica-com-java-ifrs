package moduloI;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("É mamífero? ");
        var mamifero = leitura.nextLine();

        if (mamifero.equalsIgnoreCase("sim")) {
            System.out.println("É quadrúpede? ");
            var quadrupede = leitura.nextLine();

            if (quadrupede.equalsIgnoreCase("sim")) {
                System.out.println("É carnívoro? ");
                var carnivoro = leitura.nextLine();
                
                if (carnivoro.equalsIgnoreCase("sim")) {
                    System.out.println("Leão.");
                } else if (carnivoro.equalsIgnoreCase("não") || carnivoro.equalsIgnoreCase("nao"))  {
                    System.out.println("É herbívoro? ");
                    var herbivoro = leitura.nextLine();
                    
                    if (herbivoro.equalsIgnoreCase("sim")) {
                        System.out.println("Cavalo!");
                    } else if (herbivoro.equalsIgnoreCase("não") || herbivoro.equalsIgnoreCase("nao")) {
                        System.out.println("Não foi possível advinhar.");
                    }
                }
            } else if (quadrupede.equalsIgnoreCase("não") || quadrupede.equalsIgnoreCase("nao")) {
                System.out.println("É bípede? ");
                var bipede = leitura.nextLine();

                if (bipede.equalsIgnoreCase("sim")) {
                    System.out.println("É onívoro?");
                    var onivoro = leitura.nextLine();
                    
                    if (onivoro.equalsIgnoreCase("sim")) {
                        System.out.println("Homem.");
                    } else if (onivoro.equalsIgnoreCase("não") || onivoro.equalsIgnoreCase("nao")) {
                        System.out.println("É frutívoro?");
                        var frutivoro = leitura.nextLine();
                        
                        if (frutivoro.equalsIgnoreCase("sim")) {
                            System.out.println("Macaco.");
                        } else if (frutivoro.equalsIgnoreCase("não") || frutivoro.equalsIgnoreCase("nao")) {
                            System.out.println("Não foi possível advinhar.");
                        }
                    }
                } else if (bipede.equalsIgnoreCase("não") || bipede.equalsIgnoreCase("nao")) {
                    System.out.println("É voador?");
                    var voador = leitura.nextLine();
                    
                    if (voador.equalsIgnoreCase("sim")) {
                        System.out.println("Morecego.");
                } else if (voador.equalsIgnoreCase("não") || voador.equalsIgnoreCase("nao")) {
                        System.out.println("É aquático?");
                        var aquatico = leitura.nextLine();
                        
                        if (aquatico.equalsIgnoreCase("sim")) {
                            System.out.println("Baleia.");
                        } else if (aquatico.equalsIgnoreCase("não") || aquatico.equalsIgnoreCase("nao")) {
                            System.out.println("Não foi possível advinhar.");
                        }
                    }
                }
            }
        } else if (mamifero.equalsIgnoreCase("não") || mamifero.equalsIgnoreCase("nao")) {
            System.out.println("É uma ave?");
            var ave = leitura.nextLine();
            
            if (ave.equalsIgnoreCase("sim")) {
                System.out.println("É não-voadora?");
                var naoVoadora = leitura.nextLine();

                if (naoVoadora.equalsIgnoreCase("Sim")) {
                    System.out.println("É tropical?");
                    var tropical = leitura.nextLine();

                    if (tropical.equalsIgnoreCase("sim")) {
                        System.out.println("Avestruz.");
                    } else if (tropical.equalsIgnoreCase("não") || tropical.equalsIgnoreCase("nao")) {
                        System.out.println("É polar?");
                        var polar = leitura.nextLine();

                        if (polar.equalsIgnoreCase("sim")) {
                            System.out.println("Pinguim.");
                        } else if (polar.equalsIgnoreCase("não") || polar.equalsIgnoreCase("nao")) {
                            System.out.println("Não foi possível advinhar.");
                        }
                    }
                } else if (naoVoadora.equalsIgnoreCase("não") || naoVoadora.equalsIgnoreCase("nao")) {
                    System.out.println("É nadadora?");
                    var nadadora = leitura.nextLine();

                    if (nadadora.equalsIgnoreCase("sim")) {
                        System.out.println("Pato.");
                    } else if (nadadora.equalsIgnoreCase("não") || nadadora.equalsIgnoreCase("nao")) {
                        System.out.println("É de rapina?");
                        var rapina = leitura.nextLine();

                        if (rapina.equalsIgnoreCase("sim")) {
                            System.out.println("Águia.");
                        } else if (rapina.equalsIgnoreCase("não") || rapina.equalsIgnoreCase("nao")) {
                            System.out.println("Não foi possível advinhar.");
                        }
                    }
                }
            } else if (ave.equalsIgnoreCase("não") || ave.equalsIgnoreCase("nao")) {
                System.out.println("É um réptil?");
                var reptil = leitura.nextLine();
                
                if (reptil.equalsIgnoreCase("sim")) {
                    System.out.println("Tem casco?");
                    var casco = leitura.nextLine();
                    
                    if (casco.equalsIgnoreCase("sim")) {
                        System.out.println("Tartaruga.");
                    } else if (casco.equalsIgnoreCase("não") || casco.equalsIgnoreCase("nao")) {
                        System.out.println("É carnívoro?");
                        var carnivoro = leitura.nextLine();

                        if (carnivoro.equalsIgnoreCase("sim")) {
                            System.out.println("Crocodilo.");
                        } else if (carnivoro.equalsIgnoreCase("não") || carnivoro.equalsIgnoreCase("nao")) {
                            System.out.println("Sem patas?");
                            var semPatas = leitura.nextLine();

                            if (semPatas.equalsIgnoreCase("sim")) {
                                System.out.println("Cobra.");
                            } else if (semPatas.equalsIgnoreCase("não") || semPatas.equalsIgnoreCase("nao")) {
                                System.out.println("Não é possível advinhar.");
                            }
                        }
                    }
                } else if (reptil.equalsIgnoreCase("não") || reptil.equalsIgnoreCase("nao")) {
                    System.out.println("Não foi possível advinhar.");
                }
            }
        } 
    }
}
