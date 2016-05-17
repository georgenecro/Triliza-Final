package com.entity;

import com.Triliza.LineType;

public class OneMove {
	public int j;
	public int i;
	public TypeOfMove type;
	public LineType typeLine;

	public OneMove(int i, int j, TypeOfMove typeFieldElement) {
		this.type = typeFieldElement;
		this.j = j;
		this.i = i;
	}

	public OneMove(int i, int j, TypeOfMove typeFieldElement,
			LineType typeLine) {
		this.typeLine = typeLine;
		this.type = typeFieldElement;
		this.j = j;
		this.i = i;
	}
}
