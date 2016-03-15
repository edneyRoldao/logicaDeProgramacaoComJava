package reflectionsWithAnnotations.secondExample;

import java.io.Serializable;

/**
 * NOTICE: Pay attention at getters methods, they are annotated.
 * @author Edney Roldao
 *
 */
public class Phone implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigoPais;
	private String operadora;

	
	@NameProperty("codigoInternacional")
	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	@Ignore
	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

}
