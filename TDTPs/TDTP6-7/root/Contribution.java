package root;
import java.util.ArrayList;
import root.Contributeurs;
import root.NoticeBibliographique;

public class Contribution {
    protected NoticeBibliographique notice;
    private Contributeurs c;
    private ArrayList<Role> nature;

    public Contribution(){}

    public Contribution(NoticeBibliographique notice, Contributeurs c){
        this.notice = notice;
        this.c = c;
    }

    public NoticeBibliographique getNotice(){
        return this.notice;
    }

    public Contributeurs getContributeur(){
        return this.c;
    }
}
