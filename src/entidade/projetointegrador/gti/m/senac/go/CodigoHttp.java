/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.projetointegrador.gti.m.senac.go;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CodigoHttp {
    
    private int codigo;
    private final ArrayList<String> DESCRICAO = new ArrayList();
    private  ArrayList<String> code_list = new ArrayList();
    private String[] values = new String[]{
        "100" , " Continue (1.1)",  "101" , " Protocolos de comutação (1.1)", "200" , " OK", "201" , " Criado",
                "202" , " Aceite",
                "203" , " A informação não-autorizada (1.1)",
                "204" , " Nenhum conteúdo",
                "205" , " Conteúdo Reset (1.1)",
                "206" , " conteúdo parcial (1,1)",
                "300" , " Escolhas múltiplas (1,1)",
                "301" , " Movido permanentemente",
                "302" , " Encontrado (1.1), Movido temporariamente (1,0)",
                "303" , " Ver Outros (1,1)",
                "304" , " não modificado",
                "305" , " Use Proxy (1.1)",
                "307" , " Redirect Temporária (1.1)",
                "400" , " Bad Request",
                "401" , " Unauthorized",
                "402" , " Pagamento obrigatório (1.1)",
                "403" , " Proibido",
                "404", " não encontrado",
                "405" , " Método não permitido (1.1)",
                "406" , " Não aceitável (1,1)",
                "407" , " Autenticação de proxy necessária (1.1)",
                "408" , " pedido Time-out (1.1)",
                "409" , " Conflito (1.1)",
                "410" , " Gone (1.1)",
                "411" , " comprimento necessário (1.1)",
                "412" , " Condição prévia falhada (1.1)",
                "413" , " pedido Entidade muito grande (1,1)",
                "414" , " Request-URI muito grande (1,1)",
                "415" , " Tipo de mídia não suportado (1.1)",
                "416" , " Intervalo solicitado não satisfatório (1.1)",
                "417" , " Expectativa falhada (1.1)",
                "500" , " Internal Server Error",
                "501" , " não implementado",
                "502"	, " Bad Gateway",
                "503" , " serviço indisponível",
                "504" , " Gateway Time-out (1.1)",
                "505" , " Versão HTTP não suportada (1.1)"
    };
    
   

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<String> getDESCRICAO() {
        return DESCRICAO;
    }

    public ArrayList<String> getCODE_LIST() {
        return code_list;
    }
    
    
    
    
}
