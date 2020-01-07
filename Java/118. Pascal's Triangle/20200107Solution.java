//my answer


class 20200107Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();	//初始化数组

        if (numRows == 0) return triangle;								//0返回空数组

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);											//构造第一行[1]

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();						//初始化当前构造的一行
            List<Integer> prevRow = triangle.get(rowNum-1);				//得到前一行

            row.add(1);													//第一个元素为1

            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));				//利用上一行的数据遍历得到这一行的数组
            }

            row.add(1);													//最后一个元素为1

            triangle.add(row);											//将构造的数组加入二维数组中
        }

        return triangle;
    }
}
