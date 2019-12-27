package Post;

public class Post {
	public String Text;
    public int likes;
    public String postVideo;
    public String[] postPhotos;
    public String postprivacy;
    public PostChecker checker;
    public void makePost(String text , String[]pics) {};
    public boolean addpost(Post post){return true;};
    public void Share(){};
    public void removePost(Post p){};
    public void Like(){};
    public void Comment(String text){};
}
