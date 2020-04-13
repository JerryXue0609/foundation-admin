$(function () {
    var data = getdata();
    var myChart = echarts.init(document.getElementById('myChart'));

    var themeChart = echarts.init(document.getElementById('myChart_Theme'));

    function getdata(){
        var showData = []
        var legendData = []
        $.ajax({
            type: "POST",
            url: baseURL + "foundation/foundation/statistics",
            async:false,
            success: function (r) {
                if (r.code === 0) {
                    var data = r.data;
                    for (let dataKey in data) {
                        showData.push({
                            name: data[dataKey].name,
                            value: data[dataKey].totalmoney,
                        })  //将对象push到数组
                        legendData.push(data[dataKey].name);
                    }
                } else {
                    layer.alert(r.msg);
                }
            }
        });
        var data ={}
        data.showData = showData;
        data.legendData = legendData;
        return data;

    }

    let option = {
        title: {
            text: '基金分布统计',
            subtext: 'foundation statistics',
            left: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
            type: 'scroll',
            orient: 'vertical',
            right: 10,
            top: 20,
            bottom: 20,
            data: data.legendData
        },
        series: [
            {
                name: '基金投资具体分布',
                type: 'pie',
                radius: '55%',
                data: data.showData,
                itemStyle:{
                    normal:{
                        label:{
                            show: true,
                            formatter: '{b} : {c} ({d}%)'
                        },
                        labelLine :{show:true}
                    }
                }
            }
        ]
    };


    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);

});

var vm = new Vue({
    el: '#rrapp',
    data: {
        statisticsPage: true,
        title: "基金统计页面",
        foundation: {}
    },
    methods: {
    }
});