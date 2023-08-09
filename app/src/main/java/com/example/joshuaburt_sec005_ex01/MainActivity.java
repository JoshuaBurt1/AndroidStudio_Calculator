package com.example.joshuaburt_sec005_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    // declare various views variables
    Button btnAdd, btnSub, btnMpy, btnDiv;
    TextView txtResult;
    EditText editTextNumber1, editTextNumber2;
    double number1, number2, result;
    String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set up references to the views in the GUI
//        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
//        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
//        btnAdd = (Button) findViewById(R.id.buttonADD);
//        txtResult = (TextView) findViewById(R.id.textViewResult);
        setReferences();

// Alternate button setup using listener
//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // writing the code here to access and use the values in the edittextNumber1 and edittextNumber2
//                number1 = Double.parseDouble(editTextNumber1.getText().toString());
//                number2 = Double.parseDouble(editTextNumber2.getText().toString());
//                result = number1 + number2;
//                // now you have to assign the value of result to txtResult
//                txtResult.setText("Output: " + String.valueOf(result));
//                output = txtResult.getText().toString();
//                // display the result using Toast..It is like your MessageBox in window forms
//                Toast.makeText(getApplicationContext(), txtResult.getText().toString(), Toast.LENGTH_SHORT).show();
//            }
//        }); // end of listener
    } // end method

    private void setReferences()
    {
        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        txtResult = (TextView) findViewById(R.id.textViewResult);
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnSub = (Button) findViewById(R.id.buttonSub);
        btnMpy = (Button) findViewById(R.id.buttonMpy);
        btnDiv = (Button) findViewById(R.id.buttonDiv);
    } // end method

    public void add(View view) {
        // writing the code here to access and use the values in the edittextNumber1 and edittextNumber2
        if (editTextNumber1.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)") && editTextNumber2.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)")) { //matches real # only
            number1 = Double.parseDouble(editTextNumber1.getText().toString());
            number2 = Double.parseDouble(editTextNumber2.getText().toString());
            result = number1 + number2;
            // now you have to assign the value of result to txtResult
            txtResult.setText("Output: " + String.valueOf(result));
        }
        else {
            txtResult.setText(String.format("")); //removes previous text
            txtResult.setText(String.format("Enter a number"));
        }
        output = txtResult.getText().toString();
        // display the result using Toast..It is like your MessageBox in window forms
        Toast.makeText(getApplicationContext(), txtResult.getText().toString(), Toast.LENGTH_SHORT).show();
    } // end method subtract

    public void subtract(View view) {
        // writing the code here to access and use the values in the edittextNumber1 and edittextNumber2
        if (editTextNumber1.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)") && editTextNumber2.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)")) { //matches real # only
            number1 = Double.parseDouble(editTextNumber1.getText().toString());
            number2 = Double.parseDouble(editTextNumber2.getText().toString());
            result = number1 - number2;
            // now you have to assign the value of result to txtResult
            txtResult.setText("Output: " + String.valueOf(result));
        }
        else {
            txtResult.setText(String.format("")); //removes previous text
            txtResult.setText(String.format("Enter a number"));
        }
        output = txtResult.getText().toString();
        // display the result using Toast..It is like your MessageBox in window forms
        Toast.makeText(getApplicationContext(), txtResult.getText().toString(), Toast.LENGTH_SHORT).show();
    } // end method subtract

    public void multiply(View view) {
        // writing the code here to access and use the values in the edittextNumber1 and edittextNumber2
        if (editTextNumber1.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)") && editTextNumber2.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)")) { //matches real # only
            number1 = Double.parseDouble(editTextNumber1.getText().toString());
            number2 = Double.parseDouble(editTextNumber2.getText().toString());
            result = number1 * number2;
            // now you have to assign the value of result to txtResult
            txtResult.setText("Output: " + String.valueOf(result));
        }
        else {
            txtResult.setText(String.format("")); //removes previous text
            txtResult.setText(String.format("Enter a number"));
        }
        output = txtResult.getText().toString();
        // display the result using Toast..It is like your MessageBox in window forms
        Toast.makeText(getApplicationContext(), txtResult.getText().toString(), Toast.LENGTH_SHORT).show();
    } // end method multiply

    public void divide(View view) {
        // writing the code here to access and use the values in the edittextNumber1 and edittextNumber2
        if (editTextNumber1.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)") && editTextNumber2.getText().toString().matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)")) { //matches real # only
            number1 = Double.parseDouble(editTextNumber1.getText().toString());
            number2 = Double.parseDouble(editTextNumber2.getText().toString());
            result = number1/number2;
            // now you have to assign the value of result to txtResult
            txtResult.setText("Output: " + String.valueOf(result));
        }
        else {
            txtResult.setText(String.format("")); //removes previous text
            txtResult.setText(String.format("Enter a number"));
        }
        output = txtResult.getText().toString();
        // display the result using Toast..It is like your MessageBox in window forms
        Toast.makeText(getApplicationContext(), txtResult.getText().toString(), Toast.LENGTH_SHORT).show();
    } // end method divide
} // end class