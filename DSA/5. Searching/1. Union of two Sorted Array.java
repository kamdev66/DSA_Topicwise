public static ArrayList<Integer> union(int[] a,int[] b) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                if(list.size()>0 && list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }else if(list.size()==0){
                    list.add(a[i]);
                }
                i++;
                j++;
            }else if(a[i]<b[j]){
               if(list.size()>0 && list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                else if(list.size()==0){
                    list.add(a[i]);
                }
                i++; 
            }else{
                if(list.size()>0 && list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }else if(list.size()==0){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(list.size()>0 && list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                else if(list.size()==0){
                    list.add(a[i]);
                }
                i++; 
        }
        while(j<b.length){
            if(list.size()>0 && list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }else if(list.size()==0){
                    list.add(b[j]);
                }
                j++;
        }
        return  list;
    }