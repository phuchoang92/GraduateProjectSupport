package com.mycompany.graduateprojectsupport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topsis {

    private List<MentorPoint> listOfChoice;
    
    private int numberOfChoices = 0;
    private List<Double> PhuhopHocHam;
    private List<Double> PhuhopKetQua;
    private List<Double> PhuhopNamCongTac;
    private List<Double> PhuhopNamChuyenMon;
    private double[] bestChoiceDistance;
    private double[] worstChoiceDistance;
    private double[] weights = {0.2, 0.2, 0.1, 0.5};

    public Topsis(List<MentorPoint> listOfChoice) {
        this.listOfChoice = listOfChoice;
        this.numberOfChoices = listOfChoice.size();
        
        this.PhuhopHocHam = new ArrayList<>();
        this.PhuhopKetQua = new ArrayList<>();
        this.PhuhopNamCongTac = new ArrayList<>();
        this.PhuhopNamChuyenMon = new ArrayList<>();
        this.AssignData();
    }
    
    private void AssignData(){
        for(int i = 0; i< numberOfChoices; i++){
            PhuhopHocHam.add(Double.valueOf(listOfChoice.get(i).getHocHam()));
            PhuhopKetQua.add(Double.valueOf(listOfChoice.get(i).getDiemDoAn()));
            PhuhopNamCongTac.add(Double.valueOf(listOfChoice.get(i).getSoNamCongTac()));
            PhuhopNamChuyenMon.add(Double.valueOf(listOfChoice.get(i).getDetai()));
        }
    }
    
    private double distance(double[] choice, double[] idea){
        double result = 0.0f;
        
        for(int i = 0; i< choice.length; i++){
            result += Math.pow((choice[i]-idea[i]), 2);
        }
        
        return Math.sqrt(result);
    }
    
    private double getNorm(List<Double> list, double maxValue){
        double norm = 0.0; 
        for(int i = 0; i< list.size(); i++){
            norm += Math.pow(list.get(i) / maxValue, 2);
        }
        
        return Math.sqrt(norm);
    }
    
    public void nomalizeAndWeighted(){
        
        double maxHocHam = Collections.max(PhuhopHocHam);
        double maxKetQua = Collections.max(PhuhopKetQua);
        double maxNamCongTac = Collections.max(PhuhopNamCongTac);
        double maxNamChuyenMon = Collections.max(PhuhopNamChuyenMon);
        
        double normPhuhopHocHam = this.getNorm(PhuhopHocHam, maxHocHam);
        double normPhuhopKetQua = this.getNorm(PhuhopKetQua, maxKetQua);
        double normPhuhopNamCongTac = this.getNorm(PhuhopNamCongTac, maxNamCongTac);
        double normPhuhopNamChuyenMon = this.getNorm(PhuhopNamChuyenMon, maxNamChuyenMon);
        
        for(int i = 0; i< numberOfChoices; i++){
            PhuhopHocHam.set(i, PhuhopHocHam.get(i) / normPhuhopHocHam);
            PhuhopKetQua.set(i, PhuhopKetQua.get(i) / normPhuhopKetQua);
            PhuhopNamCongTac.set(i, PhuhopNamCongTac.get(i) / normPhuhopNamCongTac);
            PhuhopNamChuyenMon.set(i, PhuhopNamChuyenMon.get(i) / normPhuhopNamChuyenMon);
        }
        
        for(int i = 0; i < numberOfChoices; i++){
            PhuhopHocHam.set(i, PhuhopHocHam.get(i)*this.weights[0]);
            PhuhopKetQua.set(i, PhuhopKetQua.get(i)*this.weights[1]);
            PhuhopNamCongTac.set(i, PhuhopNamCongTac.get(i)*this.weights[2]);
            PhuhopNamChuyenMon.set(i, PhuhopNamChuyenMon.get(i)*this.weights[3]);
        }
        
        for(int i = 0; i< numberOfChoices; i++){
            System.out.println(PhuhopNamChuyenMon.get(i)+"\n");
        }
    }
    
    public void calculate(){
        
        double[] bestChoice  = {
            Collections.max(PhuhopHocHam), 
            Collections.max(PhuhopKetQua),
            Collections.max(PhuhopNamCongTac),
            Collections.max(PhuhopNamChuyenMon)
        };
        
        double[] worstChoice  = {
            Collections.min(PhuhopHocHam),  
            Collections.min(PhuhopKetQua), 
            Collections.min(PhuhopNamCongTac), 
            Collections.min(PhuhopNamChuyenMon)
        };
        
        bestChoiceDistance = new double[numberOfChoices];
        worstChoiceDistance = new double[numberOfChoices];
        List<Double> similarePerformance = new ArrayList<>();
        
        for(int i = 0; i< numberOfChoices; i++){
            
            double[] choice  = {
                PhuhopHocHam.get(i),
                PhuhopKetQua.get(i),
                PhuhopNamCongTac.get(i),
                PhuhopNamChuyenMon.get(i)
            };
            
            bestChoiceDistance[i] = this.distance(choice, bestChoice);
            worstChoiceDistance[i] = this.distance(choice, worstChoice);
            double performanceScore = worstChoiceDistance[i]/(bestChoiceDistance[i] + worstChoiceDistance[i]);
            similarePerformance.add(i, performanceScore);
        }   
    }
}
