void main(){
        String usu, pass;
        Scanner entrada = new Scanner(System.in);

        System.out.print("pido usuario: ");
        usu = entrada.next();
        System.out.print("pido contraseña: ");
        pass = entrada.next();

        if (usu.equals("admin") && pass.equals("1234")){
            System.out.print("acceso concedido");
        } else {
            System.out.print("acceso denegado");
        }
}
