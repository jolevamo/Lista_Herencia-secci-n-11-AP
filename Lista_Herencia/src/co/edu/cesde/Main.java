package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        /*ArrayList<Integer> data = new ArrayList();
        data.add(7);
        data.add(5);
        data.add(0,8);
        System.out.println(data.get(2));*/
        //Herencia
        //Se crea el arreglo dinamico
        List<Monitor> monitores = new ArrayList();
        List<CPU> CPUS = new ArrayList();
        List<Tv> TVS = new ArrayList();
        //Se crea el objeto
        //Monitor monitor = new Monitor();
        //Se capturan los valores para los campos:

        String i= "Si";
        while (i.equals("Si") ||i.equals("si")||i.equals("SI")){
            System.out.println("Ingrese la opción deseada (1.CPU, 2.Monitor, 3.Tv): ");
            int option= Integer.parseInt(inputData.nextLine());
            switch (option){
                case 1:
                    CPU cpu = new CPU ();
                    System.out.println("Ingrese marca de la CPU: ");
                    cpu.setBrand(inputData.nextLine());
                    System.out.println("Ingrese nombre de la CPU: ");
                    cpu.setName(inputData.nextLine());
                    System.out.println("Ingrese referencia de la CPU: ");
                    cpu.setReference(inputData.nextLine());
                    System.out.println("Ingrese las Ram de la CPU: ");
                    cpu.setRam(inputData.nextLine());
                    System.out.println("Ingrese el disco duro de la CPU: ");
                    cpu.setHardDisK(inputData.nextLine());
                    CPUS.add(cpu);
                    break;
                case 2:
                    Monitor monitor = new Monitor();
                    System.out.println("Ingrese marca del monitor: ");
                    monitor.setBrand(inputData.nextLine());
                    System.out.println("Ingrese nombre del monitor: ");
                    monitor.setName(inputData.nextLine());
                    System.out.println("Ingrese referencia del monitor: ");
                    monitor.setReference(inputData.nextLine());
                    System.out.println("Ingrese tamaño pantalla del monitor: ");
                    monitor.setScreenSize(inputData.nextLine());
                    System.out.println("Ingrese resolución del monitor: ");
                    monitor.setResolution(inputData.nextLine());
                    monitores.add(monitor);
                    break;
                case 3:
                    Tv tv = new Tv ();
                    System.out.println("Ingrese marca del Tv: ");
                    tv.setBrand(inputData.nextLine());
                    System.out.println("Ingrese nombre del Tv: ");
                    tv.setName(inputData.nextLine());
                    System.out.println("Ingrese referencia del Tv: ");
                    tv.setReference(inputData.nextLine());
                    System.out.println("Ingrese tamaño pantalla del Tv: ");
                    tv.setScreenSize(inputData.nextLine());
                    System.out.println("Ingrese resolución del Tv: ");
                    tv.setResolution(inputData.nextLine());
                    TVS.add(tv);
                    break;
            }
            System.out.println("Desea agregar otro producto (Si o no):");
            i = inputData.nextLine();

        }
        System.out.println("Ingrese los productos que desea visualizar, asi: (1.CPU, 2.Monitor, 3.Tv): ");
        int caso= Integer.parseInt(inputData.nextLine());
        switch (caso){
            case 1:
                for (int a = 0; a < CPUS.size();a++){
                    System.out.println("Las CPU compradas son las siguientes:"+CPUS.get(a).mostrarCpu());
                }
                break;
            case 2:
                for (int b = 0; b < monitores.size();b++){
                    System.out.println("Los monitores comprados son las siguientes:"+"\n"+monitores.get(b).mostrarMon());
                }
                break;
            case 3:
                for (int c = 0; c < TVS.size();c++){
                    System.out.println("Los Tv comprados son las siguientes:"+"\n"+TVS.get(c).mostrartV());
                }
                break;
        }
        System.out.println("Escriba la referencia que desea buscar: ");
        String search = inputData.nextLine();
        int flag = 0;
        for (int d = 0; d < monitores.size();d++){
            if(monitores.get(d).getReference().equals(search)){
                flag++;
                System.out.println("la información del monitor con referencia "+search+"es: "+"\n"+
                                    monitores.get(d).mostrarMon());
                break;
            }
            if (flag==0){
                System.out.println("No se ubica ningún monitor con la referencia "+search);
            }

    }   }
}
