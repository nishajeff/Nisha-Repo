
public class History {
	private String question;
	private String response;
	
	public History(){
		question="";
		response="";
		}
	public History(String question,String response){
		this.question=question;
		this.response=response;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	public String toString(){
		return "Question:"+ this.question+"\nResponse:"+this.response;
	}

}
