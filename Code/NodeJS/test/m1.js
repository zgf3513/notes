// 自定义模块
const username = 'admin';

function whoAmI() {
    console.log(`I am ${username}`);
}
module.exports = {username, whoAmI};