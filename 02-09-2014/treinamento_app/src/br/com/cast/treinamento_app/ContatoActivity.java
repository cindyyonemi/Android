package br.com.cast.treinamento_app;

import br.com.cast.treinamento_app.entity.Contato;
import br.com.cast.treinamento_app.service.ContatoService;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class ContatoActivity extends ActionBarActivity {

	private EditText txtNome;
	private EditText txtEmail;
	private EditText txtEndereco;
	private EditText txtSite;
	private EditText txtTelefone;
	private RatingBar ratingBarRelevancia;
	private Button btnSalvar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contato);
		
		inicializarComponentes();
	
		btnSalvar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Contato contato = new Contato();
				contato.setEndereco(txtEndereco.getText().toString());
				contato.setNome(txtNome.getText().toString());
				contato.setSite(txtSite.getText().toString());
				contato.setTelefone(txtTelefone.getText().toString());
				contato.setEmail(txtEmail.getText().toString());
				contato.setRelevancia(ratingBarRelevancia.getRating());
				ContatoService.getInstance().salvar(contato);
			}
		});
	}

	private void inicializarComponentes() {
		txtNome = (EditText) findViewById(R.id.txtNome);
		txtEmail = (EditText) findViewById(R.id.txtEmail);
		txtEndereco = (EditText) findViewById(R.id.txtEndereco);
		txtSite = (EditText) findViewById(R.id.txtSite);
		txtTelefone = (EditText) findViewById(R.id.txtTelefone);
		ratingBarRelevancia = (RatingBar) findViewById(R.id.ratingBarRelevancia);
		btnSalvar = (Button) findViewById(R.id.btnSalvar);
	}

}
