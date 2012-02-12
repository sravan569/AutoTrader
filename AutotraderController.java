package Autotraders;

public class AutotraderController {
int quesID=0;
float max_Points=0;
float max_Percentage=0;
float[] ques_History;
int[] questions_AT;
boolean default_Outcome=false;

AutotraderController(){}
//all getter methods

public int get_quesID(){
	return quesID;
}

public float get_Max_Points(){
return max_Points;	
}

public float get_Max_Percentage(){
	return max_Percentage;
}

public float[] get_ques_History(){
return ques_History;	
}

public int[] get_questions_AT(){
return questions_AT;	
}




}
