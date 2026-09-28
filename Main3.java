void main() {
    /*
    Pido al usuario dos numeros distintos
     */
    int num1 = 40;
    int num2 = 30;
    /*
    muestro en pantalla cual de los dos numeros es mayor
     */
    if (num1 > num2) {
        System.out.println("El " + num1 + " es mayor " + num2);
    }else if(num2 > num1) {
        System.out.println("El " + num2 + " es mayor " + num1);
    }else{
        System.out.println("Los números son iguales");
    }
}
