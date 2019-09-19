/**
  * Copyright 2019 bejson.com 
  */
package ximalayaos.net.model.tracksbatch;
import java.util.List;

import ximalayaos.net.model.BaseResult;

/**
 * Auto-generated: 2019-09-17 19:32:5
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class TracksBatchBean extends BaseResult{

    private int total_page;
    private int total_count;
    private int current_page;
    private List<Tracks> tracks;
    public void setTotal_page(int total_page) {
         this.total_page = total_page;
     }
     public int getTotal_page() {
         return total_page;
     }

    public void setTotal_count(int total_count) {
         this.total_count = total_count;
     }
     public int getTotal_count() {
         return total_count;
     }

    public void setCurrent_page(int current_page) {
         this.current_page = current_page;
     }
     public int getCurrent_page() {
         return current_page;
     }

    public void setTracks(List<Tracks> tracks) {
         this.tracks = tracks;
     }
     public List<Tracks> getTracks() {
         return tracks;
     }

}