package ExceptionDemo7customException;

public class Teacher {
    public  void checkScore(int score)throws ScoreException{
        if(score<0||score>100){
//            throw new ScoreException();
            throw new ScoreException("你给的分数有误，分数应该在0-100");//此处应该给出自己提供的错误提示信息
        }else {
            System.out.println("分数正常");
        }
    }
}
