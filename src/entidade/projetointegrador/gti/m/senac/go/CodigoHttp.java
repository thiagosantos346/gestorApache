/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.projetoStringegrador.gti.m.senac.go;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CodigoHttp {

    private String codigo;

    private String[] codes = new String[]{
        "101",
        "200",
        "201",
        "100",
        "202",
        "203",
        "204",
        "205",
        "206",
        "300",
        "301",
        "302",
        "303",
        "304",
        "305",
        "307",
        "400",
        "401",
        "402",
        "403",
        "404",
        "405",
        "406",
        "407",
        "408",
        "409",
        "410",
        "411",
        "412",
        "413",
        "414",
        "415",
        "416",
        "417",
        "500",
        "501",
        "502",
        "503",
        "504",
        "505",
    };

    private String[] status = new String[]{
        " Continue (1.1)",
        " Protocolos de comutação (1.1)",
        " OK",
        " Criado",
        " Aceite",
        " A informação não-autorizada (1.1)",
        " Nenhum conteúdo",
        " Conteúdo Reset (1.1)",
        " conteúdo parcial (1,1)",
        " Escolhas múltiplas (1,1)",
        " Movido permanentemente",
        " Encontrado (1.1), Movido temporariamente (1,0)",
        " Ver Outros (1,1)",
        " não modificado",
        " Use Proxy (1.1)",
        " Redirect Temporária (1.1)",
        " Bad Request",
        " Unauthorized",
        " Pagamento obrigatório (1.1)",
        " Proibido",
        " não encontrado",
        " Método não permitido (1.1)",
        " Não aceitável (1,1)",
        " Autenticação de proxy necessária (1.1)",
        " pedido Time-out (1.1)",
        " Conflito (1.1)",
        " Gone (1.1)",
        " comprimento necessário (1.1)",
        " Condição prévia falhada (1.1)",
        " pedido Entidade muito grande (1,1)",
        " Request-URI muito grande (1,1)",
        " Tipo de mídia não suportado (1.1)",
        " Intervalo solicitado não satisfatório (1.1)",
        " Expectativa falhada (1.1)",
        " Internal Server Error",
        " não implementado",
        " Bad Gateway",
        " serviço indisponível",
        " Gateway Time-out (1.1)",
        " Versão HTTP não suportada (1.1)"

    };
    
    private final ArrayList<String> DESCRICAO = new ArrayList();
    private final ArrayList<String> CODE_LIST = new ArrayList();

    public CodigoHttp(String codigo) {
        this.codigo = codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    
    public CodigoHttp()
    {
        //for(int i=0; i< this.codes.length; i++)
        //{
        //    this.CODE_LIST.add(this.codes[i]);
        //    this.DESCRICAO.add(this.status[i]);
        //
        //}
    }

    
    
    
    public String getCodigo() {
        return codigo;
    }

    public ArrayList<String> getDESCRICAO() {
        return DESCRICAO;
    }

    public ArrayList<String> getCODE_LIST() {
        return CODE_LIST;
    }

}
