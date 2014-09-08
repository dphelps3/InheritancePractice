/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DavidPractice;

/**
 *
 * @author David
 */
public class Packers implements Team {

    private int rank;
    private String teamName;
    
    public Packers() {
    }
    
    public Packers (int rank, String teamName) {
        this.rank = rank;
        this.teamName = teamName;
    }
    
    @Override
    public void coach() {
        System.out.println("Mike McCarthy");
    }

    @Override
    public String getTeamName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTeamName(String teamName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRank(int rank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}