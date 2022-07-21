function dateFormat(dateStr){
    const date = new Date(dateStr);

    const year = date.getFullYear();
    const month = date.getMonth() + 1;
    const day = date.getDate();
    const hour = date.getHours();
    const minute = date.getMinutes();
    const second = date.getSeconds();

    const yearStr = year;
    const monthStr = month > 9 ? month : '0' + month;
    const dayStr = day > 9 ? day : '0' + day;
    const hourStr = hour > 9 ? hour : '0' + hour;
    const minuteStr = minute > 9 ? minute : '0' + minute;
    const secondStr = second > 9 ? second : '0' + second;

    return `${yearStr}-${monthStr}-${dayStr} ${hourStr}:${minuteStr}:${secondStr}`;
}

exports.dateFormat = dateFormat;