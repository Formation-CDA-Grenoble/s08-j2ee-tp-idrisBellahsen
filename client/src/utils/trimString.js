export default (str) => {
  const matches = str.match(/^(.{0,300})\s/);
  if (matches) {
    return matches[1];
  }
  return str;
}
