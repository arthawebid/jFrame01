package project02;

/**
 *
 * @author BCMedia
 */
public class dtAlamat {
    private int jRecord = 1;
    public int aRec = 0;
    public int Rec = 1;
    public String[][] dtBukuAlamat = new String[jRecord][3];
    

    public dtAlamat(int jRek){
        jRecord = jRek;
        dtBukuAlamat = new String[jRecord][3];
    }
    public int getJREC(){
        return jRecord;
    }
    public void StoreData(String vNM, String vAL, String vTELP){
        int idx = aRec;
      
        if(idx >= jRecord){
            return;
        }
        dtBukuAlamat[idx][0] = vNM;
        dtBukuAlamat[idx][1] = vAL;
        dtBukuAlamat[idx][2] = vTELP;
        aRec++;
    }
    public void UpdateData(){
        
        
    }
    public void DestroyData(){
        String[][] tmp = new String[jRecord][3];
        
        
        //copy data ke tmp
        int cx = 0;
        int idx = 0;
        for(int i=0; i<aRec; i++){
            
            if(i == idx){
                continue;
            }
            tmp[cx][0]=dtBukuAlamat[i][0];
            tmp[cx][1]=dtBukuAlamat[i][1];
            tmp[cx][2]=dtBukuAlamat[i][2];
            cx++;
        }
        aRec--;
        for(int i=0; i<(aRec); i++){
            dtBukuAlamat[i][0]=tmp[i][0];
            dtBukuAlamat[i][1]=tmp[i][1];
            dtBukuAlamat[i][2]=tmp[i][2];
        }
        
    }
    public String GetViewNama(int idx){
        return dtBukuAlamat[idx][0];
    }
    public String GetViewAlamat(int idx){
        return dtBukuAlamat[idx][1];
    }
    public String GetViewNoTelp(int idx){
        return dtBukuAlamat[idx][2];
    }
}