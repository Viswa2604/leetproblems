class Solution {
    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        
            return check(num);
        
        
    }
    public String check(int num){
        String[] below19={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] tens={" "," "," Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String s="";
        if(num<20){
            return below19[num];
        }
        else if(num<100){
            s+=tens[num/10]+" "+below19[num%10];
        }
        else if(num<1000){
            s+=check(num/100)+" Hundred "+check(num%100);
        }
        else if(num<1000000){
            s+=check(num/1000)+" Thousand "+check(num%1000);
        }
        else if(num<1000000000){
            s+=check(num/1000000)+" Million "+check(num%1000000);
        }
        else{
             s+=check(num/1000000000)+" Billion "+check(num%1000000000);
        }
        return s.trim();
    }
}