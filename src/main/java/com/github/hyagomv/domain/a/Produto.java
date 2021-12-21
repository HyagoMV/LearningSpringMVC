package com.github.hyagomv.domain.a;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
	private String codigo;
	private String codigoBarras;
	private CodigoFiscalOperacoesPrestacoes cfop;
	private Categoria categoria;
	private String descricao;

	private StatusProduto status;

	private BigDecimal precoCusto;
	private BigDecimal precoVenda;
	private boolean consignacao;

	private Unidade unidade;

	private String numeroPeca;
	private Dimensoes dimensoes;
	private String peso;
	private String profundidade;
	private Fabricante fabricante;

	private Estoque estoque;

	private MercadoComumSul mercosul;

	private TipoProduto tipo;
	private boolean pesavel;
	private boolean escalavel;

	private List<Fornecedor> fornecedores;

	private TipoImposto imposto;
}
