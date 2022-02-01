package Tema7;
import java.util.Scanner;
public class P7_2 {

		public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente("Pedro","Lopez","12421421L","Calle Caoba",1223123,2500.5);
		int opciones;
		double ingresar,retirada;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Que opcion desea?");
		do {
			System.out.println(" 1: Sacar dinero \n 2: Ingresar dinero \n 3: Mostrar datos \n 4:Cambiar datos \n 5:Fin");
			opciones=sc.nextInt();
			switch (opciones) {
			case 1:
				//sacar dinero
				do {
				System.out.println("Cuanto desea sacar? \n"+cuenta1.saldo);
				retirada=sc.nextDouble();
				}while(retirada>cuenta1.saldo || retirada<=0);
				cuenta1.sacarDinero(retirada);
				System.out.println("Le queda: "+ cuenta1.saldo);
				break;
			case 2:
				System.out.println("Cuanto desea ingresar? \n"+cuenta1.saldo);
				ingresar=sc.nextDouble();
				cuenta1.ingresarDinero(ingresar);
				System.out.println("Le queda: "+ cuenta1.saldo);
				System.out.println("Que operacion desea realizar");
				opciones=sc.nextInt();
				break;
			case 3:
				//mostrar
				cuenta1.consultar();
				System.out.println("Que operacion desea realizar?");
				opciones=sc.nextInt();
				break;
			case 4:
				System.out.println("Que dato desea modificar?");
				System.out.println(" ");
				System.out.println();
				System.out.println();
				System.out.println();
				break;
			case 5:
				System.out.println("Fin");
				break;
			}	
		}while (opciones!=5);
		
		
		}

	}

