package business;
import model.Vendedor;
import util.Constants;

public class RegrasVendedor {

    public static void defineCategoria(Vendedor vendedor, int tempoServico) {
        if (tempoServico > Constants.TempoServico.TEMPO_CAT_A) {
            vendedor.setCategoria('A');
        } else if (tempoServico > Constants.TempoServico.TEMPO_CAT_B) {
            vendedor.setCategoria('B');
        } else {
            vendedor.setCategoria('C');
        }
        vendedor.setTempoServico(tempoServico);
    }

    public static double getComissao(Vendedor vendedor) {
        double vendasPercent = 0;
        double totalVendas = vendedor.getTotalVendas();

        if (totalVendas > 20000) {
            vendasPercent = Constants.Vendas.MAIOR_VINTE_MIL;
        } else if (totalVendas > 10000) {
            vendasPercent = Constants.Vendas.MAIOR_DEZ_MIL;
        } else {
            vendasPercent = Constants.Vendas.MINIMO;
        }
        return vendasPercent;
    }

    public static double getGratificacao(Vendedor vendedor) {
        double percentual = 0;
        char categoria = vendedor.getCategoria();

        switch (categoria) {
            case 'A':
                percentual = Constants.Categoria.CATEGORIA_A;
                break;
            case 'B':
                percentual = Constants.Categoria.CATEGORIA_B;
            default:
                percentual = 1.0;
        }
        return (vendedor.getSalarioBase() * percentual / 100);
    }

    public static double getSalario(Vendedor vendedor) {
        return (vendedor.getSalarioBase() + getComissao(vendedor) + getGratificacao(vendedor));
    }
}