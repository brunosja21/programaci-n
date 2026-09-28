void main() {
    int edad = -1;
    Scanner entrada = new Scanner(System.in);
    while (edad < 0 || edad > 100){
        System.out.print("introduce tu edad");
        edad = entrada.nextInt();
    }
    String salida = "Con " + edad + " años se te considera ";
    if (edad <= 17){
        salida += " Menor de edad ";
    } else if (edad <= 30) {
        salida +=" Adulto joven ";
    } else if (edad <=64) {
        salida +=" adulto ";
    } else {
        salida +=" adulto mayor ";
    }
    System.out.print(salida);
}