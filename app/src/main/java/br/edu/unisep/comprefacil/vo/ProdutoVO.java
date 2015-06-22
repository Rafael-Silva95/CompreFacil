package br.edu.unisep.comprefacil.vo;

/**
 * Created by Jozemar do Amaral on 18/05/2015.
 */
public class ProdutoVO {

    private Integer idProduto;

    private String sequencia = "";

    private String nmProduto;

    private Double vlProduto;

    private Integer qtdeProduto;

    private String dsProduto;

    private String tpProduto;

    private EstabelecimentoVO estabelecimento;

    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public Double getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(Double vlProduto) {
        this.vlProduto = vlProduto;
    }

    public Integer getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(Integer qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public String getDsProduto() {
        return dsProduto;
    }

    public void setDsProduto(String dsProduto) {
        this.dsProduto = dsProduto;
    }

    public String getTpProduto() {
        return tpProduto;
    }

    public void setTpProduto(String tpProduto) {
        this.tpProduto = tpProduto;
    }

    public EstabelecimentoVO getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(EstabelecimentoVO estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
}
