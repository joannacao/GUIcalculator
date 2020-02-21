package calculator_with_GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application implements EventHandler<ActionEvent>{ 
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button zero;
	Button addition;
	Button subtraction;
	Button multiply;
	Button divide; 
	Button clear; 
	Button equals;
	Label number;
	Label equation;
	
	double firstOperand;
	double secondOperand;
	double result;
	String operator;
	boolean storeResult;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		storeResult = false;
		operator = "";
	
	    primaryStage.setTitle("Calculator"); 
	    //create buttons
	    one = new Button();
	    one.setText("1");
	    one.setOnAction(this);
	    
	    two = new Button();
	    two.setText("2");
	    two.setOnAction(this);
	    
	    three = new Button();
	    three.setText("3");
	    three.setOnAction(this);
	    
	    four = new Button();
	    four.setText("4");
	    four.setOnAction(this);
	    
	    five = new Button();
	    five.setText("5");
	    five.setOnAction(this);
	    
	    six = new Button();
	    six.setText("6");
	    six.setOnAction(this);
	    
	    seven = new Button();
	    seven.setText("7");
	    seven.setOnAction(this);
	    
	    eight = new Button();
	    eight.setText("8");
	    eight.setOnAction(this);
	    
	    nine = new Button(); 
	    nine.setText("9");
	    nine.setOnAction(this);
	    
	    zero = new Button();
	    zero.setText("0");
	    zero.setOnAction(this);
	    
	    addition = new Button();
	    addition.setText("+");
	    addition.setOnAction(this);
	    
	    subtraction = new Button();
	    subtraction.setText("-");
	    subtraction.setOnAction(this);
	    
	    multiply = new Button();
	    multiply.setText("x");
	    multiply.setOnAction(this);
	    
	    divide = new Button();
	    divide.setText("/");
	    divide.setOnAction(this);
	    
	    clear = new Button();
	    clear.setText("C");
	    clear.setOnAction(this);
	    
	    equals = new Button();
	    equals.setText("=");
	    equals.setOnAction(this);
	    
	    GridPane pane = createStandardGridPane();
	    
	    number = new Label("");
	    equation = new Label("");
	    
	    pane.add(number, 0, 0);
	    pane.add(one, 0, 1);
	    pane.add(two, 1, 1);
	    pane.add(three, 2, 1);
	    pane.add(four, 0, 2);
	    pane.add(five, 1, 2);
	    pane.add(six, 2, 2);
	    pane.add(seven, 0, 3);
	    pane.add(eight, 1, 3);
	    pane.add(nine, 2, 3);
	    pane.add(zero, 1, 4);
	    
	    pane.add(addition, 3, 1);
	    pane.add(subtraction, 3, 2);
	    pane.add(multiply, 3, 3);
	    pane.add(divide, 3, 4);
	    
	    pane.add(clear, 0, 4);
	    pane.add(equals, 2, 4);
	    
	    pane.add(equation, 4, 1);
	    
	    Scene scene = new Scene(pane,300,250);
	    primaryStage.setScene(scene);
	    primaryStage.show(); 
	}
	
	@Override
	public void handle(ActionEvent event) {
		String update;
		String updateEquation = "";
		if (event.getSource()==one) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "1";
			number.setText(update);
		}
		if (event.getSource()==two) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "2";
			number.setText(update);
		}
		if (event.getSource()==three) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "3";
			number.setText(update);
		}
		if (event.getSource()==four) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "4";
			number.setText(update);
		}
		if (event.getSource()==five) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "5";
			number.setText(update);
		}
		if (event.getSource()==six) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "6";
			number.setText(update);
		}
		if (event.getSource()==seven) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "7";
			number.setText(update);
		}
		if (event.getSource()==eight) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "8";
			number.setText(update);
		}
		if (event.getSource()==nine) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				}
			}
			update = number.getText() + "9";
			number.setText(update);
		}
		if (event.getSource()==zero) {
			if (storeResult == true) {
				if (operator.equals("")) {
					//clear firstOperand first
					number.setText("");
					//clear equation
					equation.setText("");
					storeResult = false;
				} else if (!number.getText().equals("")) {
					//if entry was already empty, don't put in zero
					update = number.getText() + "0";
					number.setText(update);
				}
			} else if (!number.getText().equals("")) {
				//if entry was already empty, don't put in zero
				update = number.getText() + "0";
				number.setText(update);
			}
		}
		if (event.getSource()==clear) {
			//reset all values
			firstOperand = 0.0;
			secondOperand = 0.0;
			result = 0.0;
			operator = "";
			number.setText("");
			equation.setText("");
		}
		
		//actual calculation: we need a var to store first operand, second operand, a counter to know which one
		//we need a var to store result and var to store operator 
		//check whether we're doing first or second operand
		
		if (event.getSource()==addition) {
			//check if there's already an operator set?
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				//store current value in second operand, calculate result, store 
				secondOperand = Double.valueOf(Integer.parseInt(number.getText()));
				if (operator.equals("+")) {
					//addition
					result = firstOperand + secondOperand;
				} else if (operator.equals("-")) {
					//subtraction
					result = firstOperand - secondOperand;
				} else if (operator.equals("*")) {
					//multiplication
					result = firstOperand*secondOperand;
				} else {
					//division
					result = firstOperand/secondOperand;
				}
				firstOperand = result; 
				result = 0.0; 
			} else if (storeResult == false) {
				firstOperand = Double.valueOf(Integer.parseInt(number.getText()));
			}
			operator = "+";
			//insert equation at the bottom
			updateEquation = Double.toString(firstOperand) + " " + operator;
			equation.setText(updateEquation);
			//clear label
			number.setText("");
		}
		if (event.getSource()==subtraction) {
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				//store current value in second operand, calculate result, store 
				secondOperand = Double.valueOf(Integer.parseInt(number.getText()));
				if (operator.equals("+")) {
					//addition
					result = firstOperand + secondOperand;
				} else if (operator.equals("-")) {
					//subtraction
					result = firstOperand - secondOperand;
				} else if (operator.equals("*")) {
					//multiplication
					result = firstOperand*secondOperand;
				} else {
					//division
					result = firstOperand/secondOperand;
				}
				firstOperand = result; 
				result = 0.0; 
			} else if (storeResult == false) {
				firstOperand = Double.valueOf(Integer.parseInt(number.getText()));
			}
			operator = "-";
			updateEquation = Double.toString(firstOperand) + " " + operator;
			equation.setText(updateEquation);
			//clear label
			number.setText("");
		}
		if (event.getSource()==multiply) {
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				//store current value in second operand, calculate result, store 
				secondOperand = Double.valueOf(Integer.parseInt(number.getText()));
				if (operator.equals("+")) {
					//addition
					result = firstOperand + secondOperand;
				} else if (operator.equals("-")) {
					//subtraction
					result = firstOperand - secondOperand;
				} else if (operator.equals("*")) {
					//multiplication
					result = firstOperand*secondOperand;
				} else {
					//division
					result = firstOperand/secondOperand;
				}
				firstOperand = result; 
				result = 0.0; 
			} else if (storeResult == false) {
				firstOperand = Double.valueOf(Integer.parseInt(number.getText()));
			}
			operator = "*";
			updateEquation = Double.toString(firstOperand) + " " + operator;
			equation.setText(updateEquation);
			//clear label
			number.setText("");
		}
		if (event.getSource()==divide) {
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				//store current value in second operand, calculate result, store 
				secondOperand = Double.valueOf(Integer.parseInt(number.getText()));
				if (operator.equals("+")) {
					//addition
					result = firstOperand + secondOperand;
				} else if (operator.equals("-")) {
					//subtraction
					result = firstOperand - secondOperand;
				} else if (operator.equals("*")) {
					//multiplication
					result = firstOperand*secondOperand;
				} else {
					//division
					result = firstOperand/secondOperand;
				}
				firstOperand = result; 
				result = 0.0; 
			} else if (storeResult == false) {
				firstOperand = Double.valueOf(Integer.parseInt(number.getText()));
			}
			operator = "/";
			updateEquation = Double.toString(firstOperand) + " " + operator;
			equation.setText(updateEquation);
			//clear label
			number.setText("");
		}
		if (event.getSource()==equals) {
			secondOperand = Double.valueOf(Integer.parseInt(number.getText()));
			//check what operator
			if (operator.equals("+")) {
				//addition
				result = firstOperand + secondOperand;
			} else if (operator.equals("-")) {
				//subtraction
				result = firstOperand - secondOperand;
			} else if (operator.equals("*")) {
				//multiplication
				result = firstOperand*secondOperand;
			} else if (operator.equals("/")){
				//division
				result = firstOperand/secondOperand;
			} else if (operator.equals("")) {
				firstOperand = Double.valueOf(Integer.parseInt(number.getText()));
				result = firstOperand;
			}
			//show result
			updateEquation = equation.getText() + " " + secondOperand + " = " + result;
			equation.setText(updateEquation);
			number.setText(Double.toString(result));
			//reset values and store result in firstOperand
			operator = "";
			firstOperand = result;
			secondOperand = 0.0;
			result = 0.0;
			storeResult = true;
		}
	}
	
	GridPane createStandardGridPane() {
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));
        return pane;
    }

}
