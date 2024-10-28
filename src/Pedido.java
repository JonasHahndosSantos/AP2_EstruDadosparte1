public class Pedido {
    private static int id;
    private String descricao;


    public Pedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public static int id() {
        return id;
    }


    @Override
    public String toString() {
        return "Pedido ID: " + id + " | Descrição: " + descricao;
    }
}
