void main() {
    int num1 = 10;
    int num2 = 2;
    char opera = '/';
    int resultado = 0;
    switch (opera) {
        case '+' -> {
            resultado = num1 + num2;
        }
        case '-' -> {
            resultado = num1 - num2;
        }
        case '*' -> {
            resultado = num1 * num2;
        }
        case '/' -> {
            resultado = num1 / num2;
        }
    }
    if (opera == '+' || opera == '-' || opera == '*' || opera == '/') {
        System.out.println(+resultado);
    }
}