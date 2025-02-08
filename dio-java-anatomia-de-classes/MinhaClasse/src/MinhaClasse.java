public class MinhaClasse {
    public static void main(String[] args) {
        
        String userName = "Natã Felipe";
        String userForename = "Resende";

        String userFullName = userFullName(userName, userForename);
        System.out.println(userFullName);
    }

    public static String userFullName(String userName, String userForename) {
        return "O Resultado do método é: ".concat(userName.concat(" ").concat(userForename));
    }
}
