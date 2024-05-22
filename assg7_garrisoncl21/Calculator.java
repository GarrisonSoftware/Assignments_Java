/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:Calculator Class
 * Methods in this class are: convertPostfix, evaluate, toString, and getPostfix
 * Last Modification: 11-03-22
 */

package assg7_garrisoncl21;
import java.util.*;

 

public class Calculator {

	String infixExp;
	String postfixExp = "";
	char temp;
	boolean flag = false;
	boolean check = false;
	Stack<Character> myStack = new Stack<Character>();
	Stack<Integer> evalStack = new Stack<Integer>();
	
	/**one parameter constructor that initializes infixExp with given expression (exp)
	 * 
	 * @param exp
	 */
	public Calculator(String exp)
	{	
		infixExp = exp;	
	}
	
	/**convertPostfix method. Takes infix expression and converts it to its postfix expression
	 * returns true if it was successful
	 * otherwise returns false
	 * @return
	 */
	private boolean convertPostfix()
	{
		for(int i = 0; i < infixExp.length();i++)
		{
			temp = infixExp.charAt(i);
			
			switch(temp)
			{
				case '+' :
				case '-' :
				case '/' :
				case '*' :
				
				{
					
					postfixExp += " ";
					if(!myStack.empty() && myStack.peek() != '(')
					{
						//if operator in myStack has higher precedence than the one in temp a negative number will be returned from the compareTo method
						//if the operator in myStack is higher then put in postfixExp and pop it from myStack
						//then push the operator of lower precedence from temp into myStack
						if(myStack.peek().compareTo(temp) < 0 || myStack.peek().compareTo(temp) == 0)
						{
							//System.out.println("temp in compareTo" + temp);
							//System.out.println("peek in compareTo" + myStack.peek());
							//postfixExp += " ";
							while(!myStack.empty() && !flag) 
							{
								
								if(myStack.peek() != '(' && myStack.peek().compareTo(temp) <= 0)
								{
									
									postfixExp += myStack.pop();
									postfixExp += " ";
									
								}
								else
								{
									flag = true;
								}
						
							}
							
							myStack.push(temp);
							flag = false;
						}
						
						else if(myStack.peek().compareTo(temp) > 0)
						{
							
							myStack.push(temp);
						}
						
						
						
					
				
					}
					
					else
					{
						myStack.push(temp);
					}
					
					break;
				}
				
	
				case '(' :
				{
			
					myStack.push(temp);
					break;
					
				}
				
				case ')' :
				{
					if(myStack.search('(') == -1)
					{
						return false;
					}
					else
					{	
						while(myStack.peek() != '(')
						{
							
							postfixExp += " ";
							postfixExp += myStack.pop();
							
						
						}
						myStack.pop();
					}
					
					break;
				}
				
				case ' ':
				{
					break;
				}
				
				default:
				{
					postfixExp += temp;
					break;
				}
			}
			
			
			
			
		}
		
		while(!myStack.empty())
		{
	
			if(myStack.peek() == '(')
			{
				
				return false;
			}
			else
			{
				
				postfixExp += " ";
				postfixExp += myStack.pop();
				
			}
			
		
			
		}
		
		return true;
		
	}
		
		
	/**evaluate method. Takes a postfix expression and calculates the value
	 * 
	 * @param givenPostfixExp
	 * @return
	 */
	public int evaluate(String givenPostfixExp)
	{
		StringTokenizer line = new StringTokenizer(givenPostfixExp," ");
		String tempToken = "";
		int operand1 ;
		int operand2 ;
		int result;
		if(!convertPostfix())
		{
			throw new IllegalStateException();
		}
		else
		{	
			while(line.hasMoreTokens())
			{
				
				tempToken = line.nextToken();
				
			
				switch(tempToken)
				{
					case "+":
					{
						operand2 = evalStack.pop();
						operand1 = evalStack.pop();
						result = operand1 + operand2;						
						evalStack.push(result);
						break;
					}
					case "-":
					{
						operand2 = evalStack.pop();
						operand1 = evalStack.pop();
						result = operand1 - operand2;
						evalStack.push(result);
						break;
					}
					case "/":
					{
						operand2 = evalStack.pop();
						operand1 = evalStack.pop();
						result = operand1 / operand2;						
						evalStack.push(result);
						break;
					}
					case "*":
					{
						operand2 = evalStack.pop();
						operand1 = evalStack.pop();
						result = operand1 * operand2;						
						evalStack.push(result);
						break;
					}
				
					case " ":
					{
						break;
					}
					default :
					{
						
						evalStack.push(Integer.parseInt(tempToken));
						break;
					}
				}
			}
		}
		
		return evalStack.pop();
	}
	
	/**Overrides the toString method
	 * 
	 * @Overide
	 * @return
	 */
		public String toString()
		{
			return infixExp;
		}
		
		/**getPostfix method. This method returns the postfix expression
		 * if there is an error it throws IllegalStateException
		 * @return
		 * @throws IllegalStateException
		 */
		public String getPostfix() throws IllegalStateException
		{
			if(!convertPostfix())
			{
				throw new IllegalStateException();
			}
			
			else
			{
				
				return postfixExp;
			}
			
		}
			
}
