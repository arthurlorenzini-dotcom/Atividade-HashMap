import java.util.HashMap;

public class Aula3 {
    public static void main(String[] args) {
        HashMap<Integer, String> produtos = new HashMap<>();

        produtos.put(78910, "Preço R$4,50(Chocolate)");
        produtos.put(78920, "Preço R$8,90(Chocolate)");
        produtos.put(78930, "Preço R$12,00(Chocolate)");

        System.out.println(produtos);
    }
}