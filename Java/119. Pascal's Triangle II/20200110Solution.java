//my answer


class 20200110Solution {
	public List<Integer> getRow(int rowIndex) {

		List<Integer> row = new ArrayList<Integer>();				//初始化数组

        row.add(1);													//构造第一行[1]

        if (rowIndex == 0) return row;								//0返回空数组

        for (int rowNum = 1; rowNum < rowIndex+1; rowNum++) {
        	List<Integer> newRow = new ArrayList<>();				//初始化当前构造的一行
            List<Integer> prevRow = row;							//得到前一行

            newRow.add(1);											//第一个元素为1

            for (int j = 1; j < rowNum; j++) {
                newRow.add(prevRow.get(j-1) + prevRow.get(j));		//利用上一行的数据遍历得到这一行的数组
            }

            newRow.add(1);
            row = newRow;											//最后一个元素为1

        }
        return row;
	}
}

//besr answer
/*
public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex-i)/(i+1);
        }
        return res; 
}
 */