//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char [3][3];
	}

	public TicTacToe(String game)
	{
		int counter = 0;
		mat = new char[3][3];
		for(int r = 0; r<mat.length; r++) {
			for(int c = 0; c<mat[r].length; c++) {
				mat[r][c]=game.charAt(counter);
				counter++;
			}
		}
	}

	public String getWinner()
	{
		int counter = 0;
		for(int r = 0; r<mat.length; r++) {
			if(mat[r][0]=='X' && mat[r][1]=='X' && mat[r][2]=='X') {
				return "X wins horizontally!";
			}
			if(mat[r][0]=='O' && mat[r][1]=='O' && mat[r][2]=='O') {
				return "O wins horizontally!";
			}
		}
		for(int c = 0; c<mat.length; c++) {
			if(mat[0][c]=='X' && mat[1][c]=='X' && mat[2][c]=='X') {
				return "X wins vertically!";
			}
			if(mat[0][c]=='O' && mat[1][c]=='O' && mat[2][c]=='O') {
				return "O wins vertically!";
			}
		}
		if(mat[0][0]=='X' && mat[1][1]=='X' && mat[2][2]=='X') {
			return "X wins diagonally!";
		}
		if(mat[0][0]=='0' && mat[1][1]=='0' && mat[2][2]=='0') {
			return "O wins diagonally!";
		}
		if(mat[0][2]=='O' && mat[1][1]=='O' && mat[2][0]=='O') {
			return "O wins diagonally!";
		}
		if(mat[0][2]=='X' && mat[1][1]=='X' && mat[2][0]=='X') {
			return "X wins diagonally!";
		}
		return "cat's game - no winner!";
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<mat.length; r++) {
			for(int c=0; c<mat[r].length; c++) {
				output += mat[r][c] + " ";
			}
			output += "\n";
		}
		return output+ getWinner() + "\n\n";
	}
}
