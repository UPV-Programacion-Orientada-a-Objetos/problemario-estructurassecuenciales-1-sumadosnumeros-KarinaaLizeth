class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]); //args datos que provienen de la línea de comandos
        int b = Integer.parseInt(args[1]); //parseInt cambia de string a integer

        SumaDosNumeros obj = new SumaDosNumeros();
        
        System.out.println(obj.suma(a,b));
    }
}
