package beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorDatas {
	private DateFormat formato;
	private Date data;
	
	public FormatadorDatas() {
		formato = DateFormat.getDateInstance();
		data = new Date();
	}
	
	public String getData() {
		return formato.format(data);
	}
	
	public void setData(Date d) {
		data = (Date)d.clone();
	}
	
	public void setFormato(String f) {
		formato = new SimpleDateFormat(f);
	}
}
