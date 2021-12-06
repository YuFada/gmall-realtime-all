// const x = 1
// const y = 2
// const z = 3
// console.count(
//     'x 的值为 ' + x + ' 且已经检查了几次？'
// )
// console.count(
//     'x 的值为 ' + x + ' 且已经检查了几次？'
// )
// console.count(
//     'y 的值为 ' + y + ' 且已经检查了几次？'
// )


function shuxue() {
    console.log('我的%s已经%d岁', '媳妇', 26)
}

function testSwitch() {
    var d=new Date().getDay();
    switch (d)
    {
        case 0:x="今天是星期日";
            break;
        case 1:x="今天是星期一";
            break;
        case 2:x="今天是星期二";
            break;
        case 3:x="今天是星期三";
            break;
        case 4:x="今天是星期四";
            break;
        case 5:x="今天是星期五";
            break;
        case 6:x="今天是星期六";
            break;


    }
    console.log(x)

    return d


}

// 调用函数

// if (testSwitch()<6){
//     console.log("我要开始曝光我媳妇的年龄了=====哈哈哈")
//     console.log("\n")
//     shuxue()
// }

//从字符串'Is this all there is'中剪去'is':
// var str='Is this all there is';
var str='""1111""';

// var subStr=new RegExp('(")(".*?")(")','g');//创建正则表达式对象,不区分大小写,全局查找
var subStr=/(")(".*?")(")/
var result=str.replace(subStr,'$2');//把'is'替换为空字符串
console.log(result);




/*
//从字符串'Is this all there is'中剪去'is':
var str='Is this all there is';

var subStr=new RegExp('is');//创建正则表达式对象
var result=str.replace(subStr,"");//把'is'替换为空字符串
console.log(result);//Is th all there is

var subStr=new RegExp('is','i');//创建正则表达式对象,不区分大小写
var result=str.replace(subStr,"");//把'is'替换为空字符串
console.log(result);//this all there is

var subStr=new RegExp('is','ig');//创建正则表达式对象,不区分大小写,全局查找
var result=str.replace(subStr,"");//把'is'替换为空字符串
console.log(result);//th all there

var subStr=/is/ig;//直接量法创建正则表达式对象,不区分大小写,全局查找
var result=str.replace(subStr,"");//把'is'替换为空字符串
console.log(result);//th all there

console.log(str);//Is this all there is 可见replace并不改变原始str*/
